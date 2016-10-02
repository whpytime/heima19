package day04;

import java.util.Scanner;

public class Demo_Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÊı£º");
		int num = sc.nextInt();

		paint99(num);
	}

	public static void paint99(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}
