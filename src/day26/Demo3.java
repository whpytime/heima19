package day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Receive().start();
		new Send().start();
	}

}

class Receive extends Thread {
	public void run() {
		try {
			DatagramSocket socket = new DatagramSocket(6666);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

			while (true) {
				socket.receive(packet);
				byte[] arr = packet.getData();
				int len = packet.getLength();
				String ip = packet.getAddress().getHostAddress();
				int port = packet.getPort();

				if ("quite".equals(new String(arr, 0, len))) {
					break;
				}
				System.out.println(ip + " : " + port + " : " + new String(arr, 0, len));
			}

			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Send extends Thread {
	public void run() {
		try {
			Scanner sc = new Scanner(System.in);
			DatagramSocket socket = new DatagramSocket();

			while (true) {
				String line = sc.nextLine();

				DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length,
						InetAddress.getByName("127.0.0.1"), 6666);
				socket.send(packet);

				if ("quite".equals(line)) {
					break;
				}
			}

			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}