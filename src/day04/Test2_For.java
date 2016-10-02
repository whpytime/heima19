package day04;

public class Test2_For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 100; i <= 999; i++) {
		// int a = i / 100;
		// int b = (i - a * 100) / 10;
		// int c = i - a * 100 - b * 10;
		// if (i == a * a * a + b * b * b + c * c * c) {
		// System.out.println(i);
		// }
		// }

		int sum = 0;
		for (int i = 100; i <= 999; i++) {
			int a = i % 10;
			int b = i / 10 % 10;
			int c = i / 100 % 10;
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("sum = " + sum);
	}

}
