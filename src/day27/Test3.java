package day27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Method;
import day27.cn.itcast.heima.DemoClass;

public class Test3 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("DemoClass.properties"));
		String line = br.readLine();

		Class clazz = Class.forName(line);
		DemoClass dc = (DemoClass) clazz.newInstance();
		dc.run();

		Method m = clazz.getMethod("run");
		m.invoke(dc);
	}

}
