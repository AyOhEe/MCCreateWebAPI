package ayohee.create_cct_api;

import org.java_websocket.server.WebSocketServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InterruptedException {
        String host = "0.0.0.0";
        int port = 8082;


        System.out.println("Starting server at " + host + ":" + port);

        WebSocketServer server = new SimpleServer(new InetSocketAddress(host, port));
        server.run();
    }
}