package day13;

import java.util.Scanner;

public class Demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		// int findNum = 44;

		Scanner sc = new Scanner(System.in);
		int findNum = sc.nextInt();

		int result = findIndex(findNum, arr, 0, arr.length - 1);
		if (result < 0) {
			System.out.println("not found");
		} else {
			System.out.println(result);
		}
	}

	public static int findIndex(int findNum, int[] arr, int min, int max) {
		int mid = (min + max) / 2;

		if (mid < min || mid > max) {
			return -1;
		} else {
			if (findNum == arr[mid]) {
				return mid;
			} else if (findNum < arr[mid]) {
				return findIndex(findNum, arr, min, mid - 1);
			} else {
				return findIndex(findNum, arr, mid + 1, max);
			}
		}
	}
}
