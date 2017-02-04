package day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_Server {

	public static void main(String[] args) throws IOException {

		ServerSocket server = new ServerSocket(12345);

		while (true) {
			final Socket socket = server.accept();

			new Thread() {
				public void run() {
					try {
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());

						String fileName = br.readLine();
						File dir = new File("update");
						dir.mkdir();
						File file = new File(dir, fileName);
						if (file.exists()) {
							ps.println("����");
							socket.close();
							return;
						} else {
							ps.println("������");
						}
						
						FileOutputStream fos = new FileOutputStream(file);
						byte[] arr = new byte[8192];
						int len;
						while((len = is.read(arr)) != -1){
							fos.write(arr, 0, len);
						}
						
						fos.close();
						socket.close();

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}.start();
		}
	}

}
