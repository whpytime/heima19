package day14;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
	}

	private static void demo4() {
		String regex = "[abc]{5}";
		System.out.println("a".matches(regex));		//true
		System.out.println("d".matches(regex));		//false
		System.out.println("ad".matches(regex));	//false
		System.out.println("".matches(regex));		//false
		System.out.println("abc".matches(regex));	//true
		System.out.println("abcab".matches(regex));		//true
	}

	private static void demo3() {
		String regex = "[abc]+";
		System.out.println("a".matches(regex));		//true
		System.out.println("d".matches(regex));		//false
		System.out.println("ad".matches(regex));	//false
		System.out.println("".matches(regex));		//false
		System.out.println("abc".matches(regex));	//true
		System.out.println("aabcabcababbbccb".matches(regex));		//true
	}

	private static void demo2() {
		String regex = "[abc]*";
		System.out.println("a".matches(regex));		//true
		System.out.println("d".matches(regex));		//false
		System.out.println("ad".matches(regex));	//false
		System.out.println("".matches(regex));		//true
		System.out.println("abc".matches(regex));	//true
		System.out.println("aabcabcababbbccb".matches(regex));		//true
	}

	private static void demo1() {
		String regex = "[abc]?";
		System.out.println("a".matches(regex));		//true
		System.out.println("d".matches(regex));		//false
		System.out.println("ad".matches(regex));	//false
		System.out.println("".matches(regex));		//true
		System.out.println("abc".matches(regex));	//false
	}

}
