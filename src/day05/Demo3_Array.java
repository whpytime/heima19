package day05;

public class Demo3_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 11, 22, 33, 44, 55, 66, 77 };

		int value = 44;

		System.out.println(getIndex(arr, value));
	}

	public static int getIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
