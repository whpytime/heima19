package day04;

public class Demo2_ForFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for (int i = 1; i <= 5; i++) {
		// for (int j = 1; j <= 5; j++) {
		// if (i >= j) {
		// System.out.print("*");
		// }
		// }
		// System.out.println();
		// }

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " * " + i + " = " + i * j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
