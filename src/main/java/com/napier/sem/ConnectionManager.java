package com.napier.sem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The type Connection manager.
 */
public class ConnectionManager {
    private Connection con;

    /**
     * Gets connection.
     *
     * @return the connection
     */
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }
        con = null;
        int retries = 5;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(3000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                return con;
            }
            catch (SQLException sqlEx) {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqlEx.getMessage());
            }
            catch (InterruptedException intEx) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
        if(con == null) {
            for (int i = 0; i < retries; ++i) {
                System.out.println("Connecting to database...");
                try {
                    // Wait a bit for db to start
                    Thread.sleep(30000);
                    // Connect to database
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?allowPublicKeyRetrieval=true&useSSL=false", "root", "example");
                    System.out.println("Successfully connected");
                    return con;
                }
                catch (SQLException sqlEx) {
                    System.out.println("Failed to connect to database attempt " + i);
                    System.out.println(sqlEx.getMessage());
                }
                catch (InterruptedException intEx) {
                    System.out.println("Thread interrupted? Should not happen.");
                }
            }
        }
        return con;
    }
}
