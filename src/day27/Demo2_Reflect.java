package day27;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

	public static void main(String[] args) throws Exception {
		Juicer j = new Juicer();
		j.run(new Apple());
		j.run(new Orange());
		System.out.println("==================");

		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();
		Juicer ju = new Juicer();
		ju.run(f);
		
	}
}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯苹果汁");
	}
}

class Orange implements Fruit {
	public void squeeze() {
		System.out.println("榨出一杯橘子汁");
	}
}

class Juicer {
	// public void run(Apple a) {
	// a.squeeze();
	// }
	//
	// public void run(Orange o) {
	// o.squeeze();
	// }

	public void run(Fruit f) {
		f.squeeze();
	}
}