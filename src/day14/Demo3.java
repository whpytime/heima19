package day14;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// demo1();
		// demo2();
		// demo3();
		// demo4();
		// demo5();
		String regex = "\\W";
		System.out.println("a".matches(regex));		//false
		System.out.println("0".matches(regex));		//false
		System.out.println("9".matches(regex));		//false
		System.out.println("".matches(regex));		//false
		System.out.println(" ".matches(regex));		//true
		System.out.println("%".matches(regex));		//true
	}

	private static void demo5() {
		String regex = "\\w";
		System.out.println("a".matches(regex)); // true
		System.out.println("0".matches(regex)); // true
		System.out.println("9".matches(regex)); // true
		System.out.println("".matches(regex)); // false
		System.out.println(" ".matches(regex)); // false
		System.out.println("%".matches(regex)); // false
		System.out.println("_".matches(regex)); // true

	}

	private static void demo4() {
		String regex = "\\s";
		System.out.println("".matches(regex)); // false
		System.out.println(" ".matches(regex)); // true
		System.out.println("	".matches(regex)); // true
		System.out.println("  ".matches(regex)); // false
	}

	private static void demo3() {
		String regex = "\\D";
		System.out.println("a".matches(regex)); // true
		System.out.println("0".matches(regex)); // false
		System.out.println("9".matches(regex)); // false
	}

	private static void demo2() {
		String regex = "\\d";
		System.out.println("a".matches(regex)); // false
		System.out.println("0".matches(regex)); // true
		System.out.println("9".matches(regex)); // true
	}

	private static void demo1() {
		String regex = ".";
		System.out.println("a".matches(regex)); // true
		System.out.println("ab".matches(regex)); // false
	}

}
