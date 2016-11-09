package day18;

import java.util.ArrayList;
import java.util.Collections;

public class Demo11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("d");
		list.add("f");
		list.add("g");
		
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "c"));
		System.out.println(Collections.binarySearch(list, "e"));
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<>();
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("a");
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
