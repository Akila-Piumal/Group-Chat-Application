package lk.ijse.chat_Application.controller;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ChatWindowController {
    public static String userName;
    public Label txtClientName;
    public TextField textMessage;
    public TextArea textArea;

    private Socket socket;
    private DataOutputStream dataOutputStream;
    private DataInputStream dataInputStream;

    public void initialize(){
        try {
            socket = new Socket("localhost", 6000);
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataInputStream = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendOnAction(MouseEvent mouseEvent) {

    }
}
