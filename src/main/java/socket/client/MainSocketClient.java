/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Dduwcs
 */
public class MainSocketClient {
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("clienttest");
        Socket sk = new Socket("localhost", 3000);
        DataInputStream dis = new DataInputStream(sk.getInputStream());
        DataOutputStream dos = new DataOutputStream(sk.getOutputStream());
        dos.writeUTF("client test");
    }
}
