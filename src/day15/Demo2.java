package day15;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("abc");
		c.add(100);
		c.add(true);
		c.add(new Student("ÀîËÄ", 24));

		Object[] arr = c.toArray();
		
		Collection c2 = new ArrayList();
		c2.add(111111);
		c2.addAll(c);
		c2.add(111111);
		System.out.println(c2);
//		c2.add(c);
//		System.out.println(c2);
		System.out.println("===============");
		
//		boolean b1 = c2.removeAll(c);
//		System.out.println(b1);
//		System.out.println(c2);
//		boolean b2 = c2.remove(c);
//		System.out.println(b2);
//		System.out.println(c2);
		System.out.println(c2.contains(c));
		System.out.println(c2.containsAll(c));
		System.out.println("================");
		
		System.out.println(c2.retainAll(c));
		System.out.println(c2);
	}

}
