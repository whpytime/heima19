package day26;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class Demo2_Send {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		DatagramSocket socket = new DatagramSocket();
		
		while(true){
			String line = sc.nextLine();
//			if("quite".equals(line)){
//				break;
//			}
			
			DatagramPacket packet = new DatagramPacket(line.getBytes(), line.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);
			socket.send(packet);
			
			if("quite".equals(line)){
				break;
			}
		}
		
		socket.close();
		
	}

}
