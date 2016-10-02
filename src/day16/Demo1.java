package day16;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("d");
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("ab");
		list.add("b");
		System.out.println(getSingle(list));
	}

	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			Object obj = lit.next();
			if (!newList.contains(obj)) {
				newList.add(obj);
			}

		}
		return newList;

	}

}
