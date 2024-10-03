package com.sportbooking.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    // URL di connessione per SQLite
    private static final String URL = "jdbc:sqlite:C:\\Users\\antrod\\IdeaProjects\\Db\\gestione_campi.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL);
    }
}
