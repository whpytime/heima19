package day04;

import java.util.Scanner;

public class Test2_Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数：");
		int row = sc.nextInt();
		System.out.println("请输入列数：");
		int column = sc.nextInt();

		paint(row, column);

	}

	public static void paint(int a, int b) {
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
