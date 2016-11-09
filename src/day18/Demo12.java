package day18;

import java.util.ArrayList;

public class Demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> list1 = new ArrayList<>();
		list1.add(new Person("张三", 23));
		list1.add(new Person("李四", 24));
		
		ArrayList<Person> list2 = new ArrayList<>();
		list1.add(new Person("王五", 25));
		list1.add(new Person("赵六", 26));
		
		list1.addAll(list2);
		
	}

}
