package Lab12;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss=new ServerSocket(8080);
            System.out.println("Waiting for Client Request");
            Socket s=ss.accept();
            BufferedReader br;
            PrintStream ps;
            String str;
            br=new BufferedReader(new InputStreamReader(s.getInputStream()));
            str=br.readLine();
            System.out.println("Received radius");
            double r=Double.parseDouble(str);
            double area=3.14*r*r;
            ps=new PrintStream(s.getOutputStream());
            ps.println(area);
            br.close();
            ps.close();
            s.close();
            ss.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
