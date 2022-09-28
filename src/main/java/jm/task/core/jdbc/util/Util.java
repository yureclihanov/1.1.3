package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private final static String URL = "jdbc:mysql://localhost:3306/test_2";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";
    private static Util util;
    private Connection connection;

    private Util() {
    }
    public static Util getInstance() {
        if (util == null) {
            util = new Util();
        }
        return util;
    }

    public Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
