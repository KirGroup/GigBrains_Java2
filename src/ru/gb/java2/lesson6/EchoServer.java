package ru.gb.java2.lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class EchoServer {

    private static final int PORT = 8189;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket()) {
            serverSocket.bind(new InetSocketAddress("localhost", 8189));
            System.out.println("Server has been started, waiting for new connection...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client is connected");

           DataInputStream input = new DataInputStream(clientSocket.getInputStream());
           DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

            processClientConnection(input, output);
        } catch (IOException e) {
            System.err.println("Failed to bind port " + PORT);
            e.printStackTrace();
        }
    }

    private static void processClientConnection(DataInputStream input, DataOutputStream output) {
        while (true) {
            try {
                String message = input.readUTF();
                System.out.println("Received message: " + message);
                if (message.equals("/end")) {
                    break;
                }

                output.writeUTF("Echo: " + message);
            } catch (IOException e) {
                System.out.println("Connection has been closed");
                break;
            }
        }
    }
}
