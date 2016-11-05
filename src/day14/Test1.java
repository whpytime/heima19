package day14;

import java.util.Arrays;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "91 27 46 38 50";
		String[] arr = s.split(" ");
		int[] arrInt = new int[arr.length];
		for (int i = 0; i < arrInt.length; i++) {
//			arrInt[i] = new Integer(arr[i]);
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt);
//		for (int i = 0; i < arrInt.length; i++) {
//			System.out.print(arrInt[i] + " ");
//		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arrInt.length; i++) {
			if(i < arrInt.length - 1){
				sb.append(arrInt[i] + " ");
			}else{
				sb.append(arrInt[i]);
			}
		}
		System.out.println(sb);
	}

}
