import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Client_Handler implements Runnable {

    public static ArrayList<Client_Handler> clientHandlers = new ArrayList<>();
    private Socket socket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private String clientUserName;

    public Client_Handler(Socket socket) {
        try {
            this.socket = socket;
            this.dataOutputStream = new DataOutputStream(socket.getOutputStream());
            this.dataInputStream = new DataInputStream(socket.getInputStream());

            this.clientUserName = dataInputStream.readUTF();
            clientHandlers.add(this);
        } catch (IOException e) {
            closeEverything(socket, dataOutputStream, dataInputStream);
        }
    }

    @Override
    public void run() {

    }

    public void closeEverything(Socket socket, DataOutputStream dataOutputStream, DataInputStream dataInputStream) {
        try {
            if (dataOutputStream != null) {
                dataOutputStream.close();
            }
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
