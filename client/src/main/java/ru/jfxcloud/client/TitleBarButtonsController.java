package ru.jfxcloud.client;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TitleBarButtonsController implements Initializable {

    @FXML
    void close(MouseEvent event) {

    Node node = (Node) event.getSource();

    Stage stage = (Stage) node.getScene().getWindow();

    stage.close();
    }

    @FXML
    void max(MouseEvent event) {

        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        //stage.setFullScreenExitHint("  ");

        stage.setFullScreen(true);

    }

    @FXML
    void min(MouseEvent event) {

        Node node = (Node) event.getSource();

        Stage stage = (Stage) node.getScene().getWindow();

        stage.setIconified(true);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
