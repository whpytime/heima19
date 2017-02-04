package day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.sun.org.apache.xalan.internal.xsltc.trax.OutputSettings;

public class Demo5_TCPClient {

	public static void main(String[] args) throws IOException, IOException {

		Socket socket = new Socket("127.0.0.1", 12345);
		
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		
		byte[] arr = new byte[1024];
		int len = is.read(arr);
		System.out.println(new String(arr, 0, len));
		
		os.write("学习挖掘机哪家强？".getBytes());
		
		socket.close();
	}

}
