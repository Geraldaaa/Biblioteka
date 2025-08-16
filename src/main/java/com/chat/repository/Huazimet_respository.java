package com.chat.repository;

import com.chat.model.Libri;
import com.chat.model.PunonjesiBibliotekes;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Huazimet_respository {

    Liber_respository lb_res = new Liber_respository();

    public void shtoHuazim(Connection conn, Libri libri, PunonjesiBibliotekes puntori, Date dataHuazimit, Date dataKthimit ) throws SQLException {

        String sql = "INSERT INTO huazimi(idLibrat,huazuar,data_huazimit,idPunonjesi, dataKthimit) VALUES(?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, libri.getId());
            statement.setBoolean(2, true);
            statement.setDate(3, dataHuazimit);
            statement.setString(4, puntori.getId());
            statement.setDate(5,dataKthimit);
            statement.executeUpdate();

            libri.setSasia(lb_res.aksesimiSasise()-1);
            lb_res.updateLiber(conn,libri);
/*
            String sqlUpdate = "UPDATE librat SET sasia = ? Where idLibrat = ?";
            PreparedStatement st = conn.prepareStatement(sqlUpdate);
            st.setInt(1,libri.getSasia()-1);
            st.setString(2,libri.getId());

            String sqlSasi = "Select sasia From Librat Where idLibrat = ?";
            PreparedStatement stSasi = conn.prepareStatement(sqlSasi);
            stSasi.setString(2,libri.getId());
            //libri.setSasia(sqlSasi);


*/
    }


    public void kthimHuazimi(Connection con, Libri libri) throws SQLException {

        libri.setSasia(libri.getSasia()+1);
        lb_res.updateLiber(con,libri);

    }



    public void updateHuazim(Connection conn, Libri libri, PunonjesiBibliotekes puntori, Date dataHuazimit, Date dataKthimit) throws SQLException {
        String sql = "UPDATE huazimi SET data_huazimit = ?, dataKthimit = ?, huazuar = ? WHERE idLibrat = ? AND idPunonjesi = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDate(1, dataHuazimit);
        statement.setDate(2, dataKthimit);
        statement.setBoolean(3, true);
        statement.setString(4, libri.getId());
        statement.setString(5, puntori.getId());
        statement.executeUpdate();

    }


    public void deleteHuazim(Connection conn,String idHuazimi) throws SQLException {
        String sql = "DELETE FROM huazimi WHERE idHuazimi=?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, idHuazimi);
        statement.executeUpdate();

    }



}


