package com.chat.repository;

import com.chat.model.PunonjesiBibliotekes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Puntori_respository {


        public void shtoPunonjes(Connection connection, PunonjesiBibliotekes p) throws SQLException {
            String sql = "INSERT INTO punonjesit (idPunonjesi, emri) VALUES (?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, p.getId());
            stmt.setString(2, p.getEmri());
            stmt.executeUpdate();
        }

        public void updatePunonjesi(Connection connection, PunonjesiBibliotekes punonjesi) throws SQLException{

            String sql = "UPDATE punonjesit SET emri = ? WHERE idPunonjesi = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1,punonjesi.getEmri());
            stm.setString(2,punonjesi.getId());
            stm.executeUpdate();

        }

        public void fshiPunonjesi(Connection connection, String idPunonjesi) throws SQLException {
            String sql = "DELETE FROM punonjesit WHERE idPunonjesi = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, idPunonjesi);
            stmt.executeUpdate();

    }







}
