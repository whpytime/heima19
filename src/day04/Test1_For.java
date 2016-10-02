package day04;

public class Test1_For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }
		// System.out.println("=============");
		// for (int i = 10; i >= 1; i--) {
		// System.out.println(i);
		// }

		// int sum = 0;
		// for (int i = 1; i <= 10; i++) {
		// sum += i;
		// }
		// System.out.println(sum);

		int sum = 0;
		for (int i = 2; i <= 100; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
