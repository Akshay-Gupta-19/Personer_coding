package SocketProgramingTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
public class ServerCode {
    public static void main(String[] args) throws IOException {
        int port=3126;
        ServerSocket serSock=new ServerSocket(port);
        System.out.println("Server started waiting for client");
        Socket sock=serSock.accept();
        System.out.println("Client Found"+sock);
        Scanner sc=new Scanner(sock.getInputStream());
        System.out.println("Client Said"+sc.next());
    }
}
