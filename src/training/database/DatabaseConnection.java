package com.example.training.database;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private final Database database;

    private DatabaseConnection(Database database) {
        this.database = database;
    }

    public static synchronized DatabaseConnection getInstance(Database database) {
        if (instance == null) {
            instance = new DatabaseConnection(database);
        }
        return instance;
    }

    public Database getDatabase() {
        return database;
    }
}
