package day18;

import java.util.ArrayList;

public class Demo12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> list1 = new ArrayList<>();
		list1.add(new Person("����", 23));
		list1.add(new Person("����", 24));
		
		ArrayList<Person> list2 = new ArrayList<>();
		list1.add(new Person("����", 25));
		list1.add(new Person("����", 26));
		
		list1.addAll(list2);
		
	}

}
