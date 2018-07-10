package ru.jfxcloud.client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class SignupPaneController implements Initializable {

    @FXML
    private TextField tf_username;

    @FXML
    private TextField tf_email;

    @FXML
    private PasswordField pf_password;

    @FXML
    void login(MouseEvent event) {

    }

    @FXML
    void signup(MouseEvent event) {

        Connection connection = DbConnect.getInstance().getConnection();

        try {
            String username = tf_username.getText();
            String email = tf_email.getText();
            String password = pf_password.getText();

            Statement statement = connection.createStatement();

            int status = statement.executeUpdate("INSERT INTO users (username, email, password)"
                    + " VALUES('"+username+"','"+email+"','"+password+"')");

            if (status > 0) {
                System.out.println("user registered");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
