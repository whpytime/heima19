package day27;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(222);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(list, "abc");
		
		System.out.println(list);
	}

}
