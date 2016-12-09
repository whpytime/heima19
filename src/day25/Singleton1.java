package day25;

public class Singleton1 {

	private Singleton1(){
		
	}
	
	private static Singleton1 s = new Singleton1();
	
	public static Singleton1 getInstance(){
		return s;
	}
	
}
