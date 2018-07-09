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
        String con_string = "jdbc:mysql://localhost:3306/jfxcloud_db" + "user=root&password=12345678";


        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(con_string);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
