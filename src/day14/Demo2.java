package day14;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
//		demo5();
//		demo6();
		String regex = "[a-z&&[^m-p]]";
		System.out.println("a".matches(regex));		//true
		System.out.println("b".matches(regex));		//true
		System.out.println("e".matches(regex));		//true
		System.out.println("D".matches(regex));		//false
		System.out.println("o".matches(regex));		//false
		System.out.println("n".matches(regex));		//false
	}

	private static void demo6() {
		String regex = "[a-z&&[^bc]]";
		System.out.println("a".matches(regex));		//true
		System.out.println("b".matches(regex));		//false
		System.out.println("e".matches(regex));		//true
		System.out.println("D".matches(regex));		//false
		System.out.println("o".matches(regex));		//true
		System.out.println("n".matches(regex));		//true
	}

	private static void demo5() {
		String regex = "[a-z&&[def]]";
		System.out.println("a".matches(regex));		//false
		System.out.println("d".matches(regex));		//true
		System.out.println("e".matches(regex));		//true
		System.out.println("D".matches(regex));		//false
		System.out.println("o".matches(regex));		//false
		System.out.println("n".matches(regex));		//false
	}

	private static void demo4() {
		String regex = "[a-d[m-p]]";
		System.out.println("a".matches(regex));		//true
		System.out.println("d".matches(regex));		//true
		System.out.println("e".matches(regex));		//false
		System.out.println("D".matches(regex));		//false
		System.out.println("o".matches(regex));		//true
		System.out.println("n".matches(regex));		//true
		System.out.println("10".matches(regex));	//false
	}

	private static void demo3() {
		String regex = "[a-zA-Z]";
		System.out.println("a".matches(regex));		//true
		System.out.println("b".matches(regex));		//true
		System.out.println("c".matches(regex));		//true
		System.out.println("D".matches(regex));		//true
		System.out.println("1".matches(regex));		//false
		System.out.println("%".matches(regex));		//false
		System.out.println("10".matches(regex));	//false
	}

	private static void demo2() {
		String regex = "[^abc]";
		System.out.println("a".matches(regex));		//false
		System.out.println("b".matches(regex));		//false
		System.out.println("c".matches(regex));		//false
		System.out.println("d".matches(regex));		//true
		System.out.println("1".matches(regex));		//true
		System.out.println("%".matches(regex));		//true
		System.out.println("10".matches(regex));	//false
	}

	private static void demo1() {
		String regex = "[abc]";
		System.out.println("a".matches(regex));		//true	
		System.out.println("b".matches(regex));		//true
		System.out.println("c".matches(regex));		//true
		System.out.println("d".matches(regex));		//false
		System.out.println("1".matches(regex));		//false
		System.out.println("%".matches(regex));		//false
	}

}
