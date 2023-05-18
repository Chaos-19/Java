/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsonmultithreading;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAEDC
 */
public class Server {

    static DataOutputStream wr = null;
    static DataInputStream rea = null;
    static BufferedReader read;
    static Socket socket = null;
    static ServerSocket server = null;
    static String in = "", out = "";

    public Server(int port) throws IOException {
        server = new ServerSocket(port);
        System.out.println("Waiting for Client.....");
        socket = server.accept();
        System.out.println("Connection Has Been Established ");
        rea = new DataInputStream(socket.getInputStream());
        wr = new DataOutputStream(socket.getOutputStream());
        read = new BufferedReader(new InputStreamReader(System.in));
    }

    static class Reader implements Runnable {

        @Override
        public void run() {
            try {
                while(socket.isConnected()){
                in = rea.readUTF();
                System.out.println("Client  :  " + in);
                }
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    static class Writer implements Runnable {

        @Override
        public void run() {
            try {
                while (!in.equals("stop")) {
                    out = read.readLine();
                    wr.writeUTF(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        Server server = new Server(5090);
        Reader rea = new Reader();
        new Thread(rea).start();
        Writer wr = new Writer();
        new Thread(wr).start();

    }
}
