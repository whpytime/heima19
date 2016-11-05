package day12;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "heima";
		String s2 = "heima";
		String s3 = "HeiMa";
		String s4 = "Œ“∞Æheima";
		String s5 = "baima";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("111111111111111111111");

		// System.out.println(s4.contains(s6));
		System.out.println(s4.endsWith(s1));

	}

}
