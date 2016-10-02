package day17;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.add("a"));
		System.out.println(hs.add("a"));
		System.out.println(hs.add("b"));
		System.out.println(hs.add("c"));
		System.out.println(hs.add("d"));
		System.out.println(hs);
		
		for (String string : hs) {
			System.out.println(string);
		}
		
		System.out.println("==============");

		ArrayList<String> list = new ArrayList<>();
		System.out.println(list.add("a"));
		System.out.println(list.add("a"));
		System.out.println(list.add("b"));

	}

}
