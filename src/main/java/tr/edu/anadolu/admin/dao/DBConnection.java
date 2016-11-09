package tr.edu.anadolu.admin.dao;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String driver="org.postgresql.Driver";
        Class.forName(driver);

        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Haberler","postgres","postgres");
    }


}
