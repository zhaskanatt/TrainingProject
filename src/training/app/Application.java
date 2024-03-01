package com.example.training.app;

import com.example.training.database.Database;
import com.example.training.database.DatabaseConnection;
import com.example.training.database.MySQLDatabase;
import com.example.training.models.User;
import com.example.training.security.Role;
import com.example.training.security.SecurityContext;

public class Application {
    public static void main(String[] args) {
        // Set up the database connection
        Database database = new MySQLDatabase();
        DatabaseConnection.getInstance(database);

        // Simulate a user login
        User currentUser = new User("adminUser", Role.ADMIN);
        SecurityContext.setCurrentUser(currentUser);

        // Example usage
        System.out.println("Current user role: " + SecurityContext.getCurrentUser().getRole());

        // Clean up
        SecurityContext.clear();
    }
}
