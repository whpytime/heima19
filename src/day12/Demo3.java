package day12;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("1111111111111111111");

		String s3 = new String("abc");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println("2222222222222222222");
		
		String s4 = "a" + "b" + "c";
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println("3333333333333333333");
		
		String s5 = "ab";
		String s6 = s5 + "c";
		System.out.println(s1 == s6);
		System.out.println(s1.equals(s6));
	}

}
