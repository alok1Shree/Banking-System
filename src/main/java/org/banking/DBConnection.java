package org.banking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/banking_system";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection = null;

    //Static block to load driver
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("MySQL JDBC driver not found");
            e.printStackTrace();
        }
    }

    //Method to get the connection
    public static Connection getConnection(){
        if(connection == null){
            try {
                connection= DriverManager.getConnection(URL,USER,PASSWORD);
                System.out.println("Connected to SQL server");
            }catch (SQLException e){
                System.out.println("Failed to connect SQL server");
                e.printStackTrace();
            }
        }
        return connection;
    }

    //Optional: Close connection method
    public static void closeConnection(){
        if(connection != null){
            try {
                connection.close();
                connection = null;
                System.out.println("MySQL connection is closed.");
            }catch (SQLException e){
               e.printStackTrace();
            }
        }
    }
}


