package day13;

import java.util.Scanner;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner sc = new Scanner(System.in);
		int findNum = sc.nextInt();

		int result = swap(findNum, arr, 0, arr.length-1);

		if (result >= 0) {
			System.out.println(result);
		} else {
			System.out.println("no find");
		}
	}

	private static int swap(int findNum, int[] arr, int min, int max) {
		// int flag = -1;
		if (findNum == arr[min]) {
			return min;
		}

		if (findNum == arr[max]) {
			return max;
		}

		int mid = (max - min) / 2;

		while (mid != 0) {
			if (findNum == arr[mid]) {
				return mid;
			} else if (findNum < arr[mid]) {
				return swap(findNum, arr, min, mid);
			} else {
				return swap(findNum, arr, mid, max);
			}

		}
		
		return -1;

	}
}
