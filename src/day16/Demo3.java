package day16;

import java.util.LinkedList;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst("a");
		list.addFirst("b");
		list.addFirst("c");
		list.addFirst("d");
		list.addFirst("e");
		list.addFirst("f");
		list.addFirst("g");
		list.addFirst("h");
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}

}
