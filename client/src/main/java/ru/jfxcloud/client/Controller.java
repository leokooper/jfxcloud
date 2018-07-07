package ru.jfxcloud.client;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea textArea;

    public void btnClickMeAction() {
        System.out.println("Java!");
    }

    public void btnclick2() {
        textArea.appendText("Java!\n");
    }
}
