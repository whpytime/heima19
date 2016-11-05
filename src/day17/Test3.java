package day17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("e");

		LinkedHashSet<String> lhs = getSingle(list);
		System.out.println(lhs);
	}

	// public static HashSet<String> getSingle(ArrayList<String> list) {
	// HashSet<String> hs = new HashSet<>();
	//
	// for (String string : list) {
	// hs.add(string);
	// }
	//
	// return hs;
	// }

	public static LinkedHashSet<String> getSingle(List<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);
		return lhs;
	}

}
