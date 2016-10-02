package day13;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("=================");

		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		System.out.println("=================");

		StringBuffer sb3 = new StringBuffer("heima");
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		System.out.println("=================");

	}

}
