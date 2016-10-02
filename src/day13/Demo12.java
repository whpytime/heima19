package day13;

import java.util.Arrays;

public class Demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 33, 44, 22, 11, 66, 55 };
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr, 1));
	}

}
