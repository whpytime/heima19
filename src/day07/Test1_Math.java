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

		// System.out.println("请输入一个数：");
		Scanner sc = new Scanner(System.in);
		// int in = sc.nextInt();

		while (true) {
			System.out.println("请输入一个数：");
			int in = sc.nextInt();
			if (in == num) {
				System.out.println("正确！");
				break;
			} else if (in < num) {
				System.out.println("小了");
			} else {
				System.out.println("大了");
			}
		}

	}

}
