package com.div.schoolmanagement.repository.inter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class AbstractDao {

    public Connection connection() throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://db:3306/quest_nadir";
        String username = "root";
        String password = "12345";

        return DriverManager.getConnection(url, username, password);
    }
}
