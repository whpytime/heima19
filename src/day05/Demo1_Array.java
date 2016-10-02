package day05;

public class Demo1_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int[] arr = new int[5];
		// for (int i = 0; i < arr.length; i++) {
		// System.out.println(arr);
		// }

		int[] arr1 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr2 = { 11, 22, 33, 44, 55 };

//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(arr1[i]);
//		}
//		System.out.println("==========");

		print(arr2);
		System.out.println();
		System.out.println("==========");
		System.out.println(getMax(arr2));
		System.out.println("==========");
		turnArray(arr2);
		print(arr2);
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int getMax(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}

	public static void turnArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

}
