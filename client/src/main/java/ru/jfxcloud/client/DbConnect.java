package ru.jfxcloud.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    private DbConnect() {

    }


    public static DbConnect getInstance(){

        return new DbConnect();
    }

    public Connection getConnection(){

        String URL = "jdbc:mysql://localhost:3306/jfxcloud_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String LOGIN = "root";
        String PASSWORD = "12345678";

        Connection connection = null;

        try {
            //FabricMySQLDriver driver = new FabricMySQLDriver();
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
