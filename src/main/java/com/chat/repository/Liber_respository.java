package com.chat.repository;

import com.chat.model.Libri;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class Liber_respository {

    private Connection connection;

    public void shtoLiber(Connection connection, Libri libri) throws SQLException {

        String sql = "INSERT INTO librat (idLibrat, titulli, numriFaqeve, gjinia, formati) values (?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,libri.getId());
        stmt.setString(2,libri.getTitulli());
        stmt.setInt(3,libri.getNumriFaqeve());
        stmt.setString(4,libri.getGjinia().name());
        stmt.setString(5,libri.getFusha());
        stmt.executeUpdate();



    }

    public void updateLiber(Connection connection, Libri libri) throws SQLException {
        String sql = "UPDATE librat SET titulli = ?, numriFaqeve = ?, gjinia = ?, formati = ? WHERE idLibrat = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, libri.getTitulli());
        stmt.setInt(2, libri.getNumriFaqeve());
        stmt.setString(3, libri.getGjinia().name());
        stmt.setString(4, libri.getFusha());
        stmt.setString(5, libri.getId());
        stmt.executeUpdate();
    }



    public void fshiLiber(Connection connection, String idLibrat) throws SQLException {
        String sql = "DELETE FROM librat WHERE idLibrat = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, idLibrat);
        stmt.executeUpdate();
    }


















}
