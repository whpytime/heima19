package day16;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("����", 23));
		list.add(new Student("����", 23));
		list.add(new Student("����", 24));
		list.add(new Student("����", 24));
		list.add(new Student("����", 24));
		list.add(new Student("����", 25));
		list.add(new Student("����", 25));
		list.add(new Student("����", 25));
		list.add(new Student("����", 23));
		ArrayList newList = getSingle(list);
		System.out.println(newList);
		newList.remove(new Student("����", 23));
		System.out.println(newList);
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
