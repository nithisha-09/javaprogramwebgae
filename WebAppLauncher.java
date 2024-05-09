import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class WebAppLauncher {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new WebAppHandler(socket)).start();
        }
    }
}

class WebAppHandler implements Runnable {

    private Socket socket;

    public WebAppHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // Handle the web app request here
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}