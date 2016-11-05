package day12;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("«Î ‰»Î£∫");
		Scanner sc = new Scanner(System.in);

		// if (sc.hasNextInt()) {
		// int i = sc.nextInt();
		// System.out.println(i);
		// } else if (sc.hasNextLine()) {
		// String str = sc.nextLine();
		// System.out.println(str);
		// } else {
		// System.out.println(" ‰»Î¥ÌŒÛ");
		// }

		// int i = sc.nextInt();
		// // System.out.println(i);
		// sc.nextByte();
		// // sc.nextByte();
		// System.out.println(i);
		// System.out.println(sc.nextLine());

		byte[] b = new byte[10];
		for (int i = 0; i < b.length; i++) {
			if (sc.hasNextByte()) {
				b[i] = sc.nextByte();
			} else {
				b[i] = '#';
				break;
			}
		}

		for (int i = 0; i < b.length; i++) {
			if (b[i] != '#') {
				System.out.println(b[i]);
			} else {
				System.out.println("#");
				break;
			}
		}

	}

}
