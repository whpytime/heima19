package day16;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(110);
//		list.add(true);
		list.add(new Student("����", 23));
		list.add(new Student("����", 24));
		list.add(new Student("����", 25));
		list.add(new Student("����", 26));
		
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()){
//			System.out.println(lit.next().getName() + "..." + );
			Student s = lit.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
		
	}
}
