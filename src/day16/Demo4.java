package day16;

import java.util.LinkedList;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		push(list, "a");
		push(list, "b");
		push(list, "c");
		push(list, "d");
		push(list, 111);
		System.out.println(list);
		System.out.println(pop(list));
		System.out.println(pop(list));
		System.out.println(pop(list));
		System.out.println(list);
	}

	public static void push(LinkedList list, Object obj){
		list.addFirst(obj);
	}
	
	public static Object pop(LinkedList list){
		Object obj = list.getFirst();
		list.removeFirst();
		return obj;
	}
	
}
