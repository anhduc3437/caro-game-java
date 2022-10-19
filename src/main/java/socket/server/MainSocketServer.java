/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Dduwcs
 */
public class MainSocketServer {
    public final static int PORT = 3000;
    
    public static void main(String[] args) throws IOException {
        ServerSocket serversocket = new ServerSocket(PORT);
        System.out.println("Server running on Port: " + PORT);
        Boolean running = true;
        while(running) {
            Socket sk = serversocket.accept();
            
            System.out.println("connected");
        }
    }
}
