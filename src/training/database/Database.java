package com.example.training.database;

import java.sql.Connection;

public interface Database {
    Connection getConnection();
}
