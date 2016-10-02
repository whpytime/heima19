package day15;

import java.util.ArrayList;
import java.util.Collection;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList();
		boolean b1 = c.add("abc");
		boolean b2 = c.add(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add("abc");
		boolean b5 = c.add(new Student("ÕÅÈý", 23));
		System.out.println(c.size());
		c.remove("abc");
		c.remove(true);
		System.out.println(c.contains(100));
		System.out.println(c);

		// System.out.println(b1);
		// System.out.println(b2);
		// System.out.println(b3);
		// System.out.println(b4);
		c.clear();
		System.out.println(c);
		System.out.println(c.isEmpty());
	}

}
