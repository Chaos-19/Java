/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handsonmultithreading;

import static handsonmultithreading.Server.socket;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GAEDC
 */
public class Client {

    static DataOutputStream wri = null;
    static DataInputStream rea = null;
    static BufferedReader read;
    static Socket socket = null;
    static String in = "", out = "";

    public Client(int port) throws IOException {
        socket = new Socket("localhost", port);
        System.out.println("Connection Has Been Established ");
        rea = new DataInputStream(socket.getInputStream());
        wri = new DataOutputStream(socket.getOutputStream());
        read = new BufferedReader(new InputStreamReader(System.in));
    }

    static class Reader implements Runnable {

        @Override
        public void run() {
            try {
                while (socket.isConnected()) {
                    in = rea.readUTF();
                    System.out.println("Server :  " + in);
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
                    wri.writeUTF(out);
                }
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public static void main(String[] args) throws IOException {
        Client client = new Client(5090);
        Reader rea = new Reader();
        new Thread(rea).start();
        Writer wr = new Writer();
        new Thread(wr).start();
    }
}
