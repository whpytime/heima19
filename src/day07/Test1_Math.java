package day07;

import java.util.Scanner;

public class Test1_Math {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 0; i < 10; i++) {
		// System.out.println((int) (Math.random() * 100) + 1);
		// }

		int num = (int) (Math.random() * 100) + 1;

		// System.out.println("������һ������");
		Scanner sc = new Scanner(System.in);
		// int in = sc.nextInt();

		while (true) {
			System.out.println("������һ������");
			int in = sc.nextInt();
			if (in == num) {
				System.out.println("��ȷ��");
				break;
			} else if (in < num) {
				System.out.println("С��");
			} else {
				System.out.println("����");
			}
		}

	}

}
