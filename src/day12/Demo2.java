package day12;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "abc";
		str = "def";
		System.out.println(str);

		String s1 = new String();
		System.out.println(s1);

		byte[] arr1 = { 97, 98, 99, 100, 127 };
		String s2 = new String(arr1);
		System.out.println(s2);
		String s3 = new String(arr1, 1, 2);
		System.out.println(s3);
		System.out.println("======================");

		char[] arr2 = { 'e', 'f', 'g', 'h' };
		String s4 = new String(arr2);
		String s5 = new String(arr2, 2, 1);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("======================");

		String s6 = new String("addf");
		System.out.println(s6);

	}

}
