package day14;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer qq = new StringBuffer(getString());
		char[] qq = getString().toCharArray();
		boolean flag = isQQ(qq);

		if (flag) {
			System.out.println(new String(qq));
		} else {
			System.out.println("´íÎóµÄQQºÅ");
		}
	}

	private static String getString() {
		Scanner sc = new Scanner(System.in);
		String qq = sc.nextLine();

		if (qq != null) {
			return qq;
		} else {
			return getString();
		}
	}

	private static boolean isQQ(char[] qq) {
		if (qq[0] == '0') {
			return false;
		} else if (qq.length < 5 || qq.length > 15) {
			return false;
		} else {
			for (int i = 0; i < qq.length; i++) {
				if (qq[i] < '0' || qq[i] > '9') {
					return false;
				}
			}
			return true;
		}
	}
}
