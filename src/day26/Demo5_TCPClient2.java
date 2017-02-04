package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sun.org.apache.xalan.internal.xsltc.trax.OutputSettings;

public class Demo5_TCPClient2 {

	public static void main(String[] args) throws IOException, IOException {

		Socket socket = new Socket("127.0.0.1", 12345);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		System.out.println(br.readLine());
		ps.println("我想报名黑马程序员");
		System.out.println(br.readLine());
		ps.println("大哭！！能不能给次机会？");
		
		socket.close();
	}

}
