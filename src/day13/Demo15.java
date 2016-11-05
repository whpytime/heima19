package day13;

public class Demo15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer i1 = new Integer(123);

		System.out.println(new Integer(123));

		System.out.println(i1.intValue());

		int x = i1;
		Integer y = x;
		System.out.println(x);
		System.out.println(y);
	}

}