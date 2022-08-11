package lk.ijse.chat_Application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUserName;
    public AnchorPane loginFormContext;

    public void btnLoginOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../views/Chat_Window.fxml"))));
            stage.setTitle("Chat Room");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
