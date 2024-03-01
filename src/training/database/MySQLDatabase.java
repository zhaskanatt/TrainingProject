package com.example.training.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDatabase implements Database {
    private Connection connection;

    public MySQLDatabase() {
        try {
            String connectionUrl = "jdbc:mysql://localhost:3306/TrainingProject";
            this.connection = DriverManager.getConnection(connectionUrl, "root", "qwerty");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        return connection;
    }
}
