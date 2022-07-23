package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    static private DB instance;
    private Connection connection;

    private DB() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ javaeepos","root","1234");
    }

    public static DB db() throws SQLException,ClassNotFoundException{
        return (instance==null) ? instance = new DB() : instance;
    }

    public Connection getConnection() {
        return connection;
    }
}
