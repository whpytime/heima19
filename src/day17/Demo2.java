package day17;

import java.util.HashSet;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 23));
		hs.add(new Person("����", 24));
		hs.add(new Person("����", 25));
		
		for (Person person : hs) {
			System.out.println(person);
		}
	}

}
