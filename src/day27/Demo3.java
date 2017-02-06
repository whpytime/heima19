package day27;

import java.lang.reflect.Constructor;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("day27.Person");
		Constructor c = clazz.getConstructor(String.class, int.class);
		Person p = (Person) c.newInstance("уехЩ", 23);
		System.out.println(p);
	}
}
