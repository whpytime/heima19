package day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo5 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("day27.Person");
		Constructor c = clazz.getConstructor(String.class, int.class);
		Person p = (Person) c.newInstance("уехЩ", 23);

		Method m = clazz.getMethod("eat");
		m.invoke(p);

		Method m2 = clazz.getMethod("eat", int.class);
		m2.invoke(p, 3);
	}

}
