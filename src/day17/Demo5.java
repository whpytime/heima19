package day17;

import java.util.TreeSet;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("����", 23));
		ts.add(new Person("����", 24));
		ts.add(new Person("����", 25));
		ts.add(new Person("����", 26));
		
		System.out.println(ts);
	}

}
