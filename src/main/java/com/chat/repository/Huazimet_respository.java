package com.chat.repository;

import com.chat.model.Libri;
import com.chat.model.PunonjesiBibliotekes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Huazimet_respository {


    public void shtoHuazim(Connection conn, Libri libri, PunonjesiBibliotekes puntori, Date dataHuazimit, Date dataKthimit ) throws SQLException {

        String sql = "INSERT INTO huazimi(idLibrat,huazuar,data_huazimit,idPunonjesi, dataKthimit) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, libri.getId());
            statement.setBoolean(2, true);
            statement.setDate(3, dataHuazimit);
            statement.setString(4, puntori.getId());
            statement.setDate(5,dataKthimit);
            statement.executeUpdate();

        }catch (Exception e){
            System.out.println(e.getStackTrace());
            System.out.println("huazimi nuk u shtua");
        }

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
