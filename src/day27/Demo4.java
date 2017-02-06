package day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo4 {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("day27.Person");
		Constructor c = clazz.getConstructor(String.class, int.class);
		Person p = (Person) c.newInstance("张三", 23);

		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "李四");
		System.out.println(p);
	}

}
