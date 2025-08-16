package com.chat.repository;

import com.chat.model.Libri;
import com.chat.model.LibriDigjital;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Liber_respository {

    private Connection connection;

    public void shtoLiber(Connection connection, Libri libri) throws SQLException {

        String sql = "INSERT INTO librat (idLibrat, titulli, numriFaqeve, gjinia, formati) values (?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, libri.getId());
        stmt.setString(2, libri.getTitulli());
        stmt.setInt(3, libri.getNumriFaqeve());
        stmt.setString(4, libri.getGjinia().name());
        stmt.setString(5, libri.getFusha());
        stmt.executeUpdate();


    }

    public void updateLiber(Connection connection, Libri libri) throws SQLException {
        String sql = "UPDATE librat SET titulli = ?, numriFaqeve = ?, gjinia = ?, formati = ? , sasia = ? WHERE idLibrat = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, libri.getTitulli());
        stmt.setInt(2, libri.getNumriFaqeve());
        stmt.setString(3, libri.getGjinia().name());
        stmt.setString(4, libri.getFusha());
        stmt.setInt(5, libri.getSasia());
        stmt.setString(6, libri.getId());
        stmt.executeUpdate();
    }


    public void fshiLiber(Connection connection, String idLibrat) throws SQLException {
        String sql = "DELETE FROM librat WHERE idLibrat = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, idLibrat);
        stmt.executeUpdate();
    }

    List<Libri> libratNeDatabaze = new ArrayList<>();
    public List<Libri> readLiber(Connection connection) throws SQLException {

        String sql = "SELECT * FROM librat";
        PreparedStatement stmt = connection.prepareStatement(sql);
        ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                String idLibri = resultSet.getString("idLibrat");
                String titulli = resultSet.getString("titulli");
                Integer sasia = resultSet.getInt("sasia");
                libratNeDatabaze.add(new LibriDigjital(idLibri,titulli));
            }

        for(Libri lb:libratNeDatabaze){
            System.out.println(lb.getId()+" " + lb.getTitulli());
        }
        return libratNeDatabaze;

    }

    public Integer aksesimiSasise(){
        for(Libri lb: libratNeDatabaze){
            return lb.getSasia();
        }
        return 0;
    }



//    public void printList(){
//        for(Libri lb:libratNeDatabaze){
//            System.out.println(lb);
//        }
//    }
}












