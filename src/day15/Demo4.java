package day15;

import java.util.ArrayList;
import java.util.List;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1, "e");
		list.add(5, "f");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		
		list.add(111);
		System.out.println(list);
		list.remove(new Integer(111));
		System.out.println(list);
		
//		Object obj1 = list.get(3);
//		System.out.println(obj1);

		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		list.set(4, 222);
		System.out.println(list);
	}

}
