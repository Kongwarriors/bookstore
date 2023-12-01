/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class DAO {
    private final String dbName = "BookStore";
    private final String userID = "sa";
    private final String password = "123";
    public static Connection con;

    public DAO() {
        if (con == null) {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=" + dbName
                    + ";user=" + userID
                    + ";password=" + password
                    + ";encrypt=false";
            try {
                con = DriverManager.getConnection(connectionUrl);
                System.out.println("Connected to SQL Server successfully.");
            } catch (SQLException e) {
                System.out.println("Error connecting to SQL Server: " + e.getMessage());
            }
        }
    }
}
