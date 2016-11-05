package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三", 23));
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));
		c.add(new Student("赵六", 26));
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName() + "..." + s.getAge());
		}
	}

	private static void demo1() {
		Collection c = new ArrayList();
//		c.add(true);
		c.add(111);
		c.add(100);
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		Iterator it = c.iterator();
		while(it.hasNext()){
//			System.out.println(it.next());
			
		}
		System.out.println("==============");
	}

}
