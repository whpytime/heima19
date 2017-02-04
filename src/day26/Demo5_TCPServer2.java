package day26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo5_TCPServer2 {

	public static void main(String[] args) throws IOException {

		// demo1();

		ServerSocket server = new ServerSocket(12345);

		while (true) {
			final Socket socket = server.accept();

			new Thread() {
				public void run() {
					try {
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintStream ps = new PrintStream(socket.getOutputStream());

						ps.println("欢迎咨询黑马程序员");
						System.out.println(br.readLine());
						ps.println("不好意思，包满了");
						System.out.println(br.readLine());
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}

		// socket.close();
	}

	private static void demo1() throws IOException {
		ServerSocket server = new ServerSocket(12345);

		Socket socket = server.accept();

		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());

		ps.println("欢迎咨询黑马程序员");
		System.out.println(br.readLine());
		ps.println("不好意思，包满了");
		System.out.println(br.readLine());
	}

}
