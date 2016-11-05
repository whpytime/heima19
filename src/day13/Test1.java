package day13;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		StringBuffer sb = new StringBuffer();
		sb.append('[');
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				// sb.append(arr[i] + "]");]
				sb.append(arr[i]).append("]");
			} else {
				// sb.append(arr[i] + ", ");
				sb.append(arr[i]).append(", ");
			}
		}

		System.out.println(sb);
	}

}
