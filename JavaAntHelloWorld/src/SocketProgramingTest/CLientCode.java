package SocketProgramingTest;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;
public class CLientCode {
    public static void main(String[] args) throws IOException {
        Socket sock=new Socket("10.234.3.51",1999);
        PrintStream ps=new PrintStream(sock.getOutputStream());
        ps.print("Hello Network");
    }
}
