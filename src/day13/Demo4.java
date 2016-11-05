package day13;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 324, 3, 546, 112 };

		// for (int i = 0; i < arr.length; i++) {
		// for (int j = i; j < arr.length; j++) {
		// if (arr[i] > arr[j]) {
		// int temp = arr[i];
		// arr[i] = arr[j];
		// arr[j] = temp;
		// }
		// }
		// }
		//
		// for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i] + " ");
		// }

		pop(arr);
		print(arr);

	}

	public static void pop(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
