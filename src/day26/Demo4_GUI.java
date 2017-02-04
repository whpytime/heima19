package day26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4_GUI extends Frame {

	private TextField tf;
	private Button btSend;
	private Button btLog;
	private Button btClear;
	private Button btShake;
	private TextArea viewText;
	private TextArea sendText;
	private DatagramSocket socket;
	private BufferedWriter bw;

	public Demo4_GUI() {
		init();
		southPanel();
		centerPanel();
		event();
	}

	public void init() {
		this.setLocation(500, 50);
		this.setSize(500, 600);

		new Receive().start();

		try {
			socket = new DatagramSocket();
			// bw = new BufferedWriter(new FileWriter("config.txt"));
		} catch (SocketException e) {
			e.printStackTrace();
		}

		try {
			bw = new BufferedWriter(new FileWriter("config.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.setVisible(true);
	}

	public void event() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					socket.close();
					bw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});

		btSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					send();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btLog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					logFile();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		btClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				viewText.setText("");
			}
		});

		btShake.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// shake();

				try {
					send(new byte[] { -1 }, tf.getText());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		sendText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER && e.isControlDown()) {
					try {
						send();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}

	private String getCurrentTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		return sdf.format(d);
	}

	public void centerPanel() {
		Panel center = new Panel();
		viewText = new TextArea();
		sendText = new TextArea(5, 1);

		center.setLayout(new BorderLayout());
		center.add(sendText, BorderLayout.SOUTH);
		center.add(viewText, BorderLayout.CENTER);
		viewText.setEditable(false);
		viewText.setBackground(Color.WHITE);
		viewText.setFont(new Font("xxx", Font.PLAIN, 15));
		sendText.setFont(new Font("xxx", Font.PLAIN, 15));
		this.add(center, BorderLayout.CENTER);
	}

	public void southPanel() {
		Panel south = new Panel();
		tf = new TextField(20);
		tf.setText("127.0.0.1");
		btSend = new Button("发送(Ctrl+Enter)");
		btLog = new Button("记录");
		btClear = new Button("清屏");
		btShake = new Button("震动");

		south.add(tf);
		south.add(btSend);
		south.add(btLog);
		south.add(btClear);
		south.add(btShake);

		this.add(south, BorderLayout.SOUTH);
	}

	private void send(byte[] arr, String ip) throws IOException {
		DatagramPacket packet = new DatagramPacket(arr, arr.length, InetAddress.getByName(ip), 9999);

		socket.send(packet);
	}

	private void send() throws IOException {
		String message = sendText.getText();
		String ip = tf.getText();
		
//		ip = ip.trim().length() == 0 ? "255.255.255.255" : ip;
		if(ip.trim().length() == 0){
			ip = "255.255.255.255";
		}

		// DatagramPacket packet = new DatagramPacket(message.getBytes(),
		// message.getBytes().length,
		// InetAddress.getByName(ip), 9999);
		//
		// socket.send(packet);
		send(message.getBytes(), ip);

		String time = getCurrentTime();
		String str = time + "  我对：" + ((ip.equals("255.255.255.255")) ? "所有人" : ip) + "  说：\r\n" + message + "\r\n\r\n";
		viewText.append(str);
		sendText.setText("");
		bw.write(str);

	}

	private class Receive extends Thread {
		@Override
		public void run() {
			try {
				DatagramSocket socket = new DatagramSocket(9999);
				DatagramPacket packet = new DatagramPacket(new byte[8192], 8192);

				while (true) {
					socket.receive(packet);
					byte[] arr = packet.getData();
					int len = packet.getLength();

					if (arr[0] == -1 && len == 1) {
						shake();
						continue;
					}

					String message = new String(arr, 0, len);
					String time = getCurrentTime();
					String ip = packet.getAddress().getHostAddress();
					String str = time + " " + ip + " 对我说：\r\n" + message + "\r\n\r\n";
					viewText.append(str);
					bw.write(str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void logFile() throws IOException {
		bw.flush();

		FileInputStream fis = new FileInputStream("config.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		int len;
		byte[] arr = new byte[8192];
		while ((len = fis.read(arr)) != -1) {
			baos.write(arr, 0, len);
		}

		String str = baos.toString();
		viewText.setText(str);

		fis.close();
	}

	private void shake() {
		int x = this.getLocation().x;
		int y = this.getLocation().y;

		for (int i = 0; i < 5; i++) {
			try {
				this.setLocation(x + 3, y + 3);
				Thread.sleep(20);
				this.setLocation(x + 3, y - 3);
				Thread.sleep(20);
				this.setLocation(x - 3, y + 3);
				Thread.sleep(20);
				this.setLocation(x - 3, y - 3);
				Thread.sleep(20);
				this.setLocation(x, y);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		new Demo4_GUI();
	}

}
