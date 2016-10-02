package day17;

import java.util.LinkedHashSet;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("d");
		
		System.out.println(lhs);
		
	}

}
