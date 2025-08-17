package com.chat.db;

import java.sql.*;


public class testMYSQL{

    public static void main(String[] args){

        //  Connection Connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bibliokteka","root","");

        try{
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/biblioteka",
                    "root",
                    "#GeraViti2003#" );

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery( "SELECT * FROM librat");


            while(resultSet.next()){

                System.out.println(resultSet.getString( "idLibrat"));

                System.out.println(resultSet.getString("titulli"));

            }

        }catch(SQLException e){

            e.printStackTrace();

        }
    }

}