package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");

		// Iterator it = list.iterator();
		// while(it.hasNext()){
		// String str = (String)it.next();
		// if("world".equals(str)){
		// list.add("javaee");
		// }
		// }

		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {
			String str = (String) lit.next();
			if ("world".equals(str)) {
				lit.add("javaee");
			}
		}
		System.out.println(list);

	}

}
