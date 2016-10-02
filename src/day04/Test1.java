package day04;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				break;
			}
			System.out.println(x + "-Java»ù´¡°à");
		}

		System.out.println("===============");

		for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				continue;
			}
			System.out.println(x + "-Java»ù´¡°à");
		}

		System.out.println("===============");

		for (int x = 1; x <= 10; x++) {
			if (x % 3 == 0) {
				System.out.println(x + "-Java»ù´¡°à");
			}
			System.out.println(x + "-Java»ù´¡°à");
		}
	}

}
