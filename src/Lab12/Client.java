package Lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws IOException {
        Socket s=new Socket(InetAddress.getLocalHost(),8080);
        BufferedReader br;
        PrintStream ps;
        String str;
        System.out.println("Enter Radius  :");
        br=new BufferedReader(new InputStreamReader(System.in));
        ps=new PrintStream(s.getOutputStream());
        ps.println(br.readLine());
        br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        str=br.readLine();
        System.out.println("Area of the circle is : "+str);
        br.close();
        ps.close();
    }
}

