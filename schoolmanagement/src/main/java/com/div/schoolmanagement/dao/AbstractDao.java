package com.div.schoolmanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao {
    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://db:3306/quest_nadir";
        String username = "root";
        String password = "root";

        return DriverManager.getConnection(url, username, password);
    }
}
