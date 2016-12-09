package day25;

public class Singleton2 {

	private Singleton2 (){
		
	}
	
	private static Singleton2 s;
	
	public static Singleton2 getInstance(){
		if(s == null){
			s = new Singleton2();
		}
		
		return s;
	}

}
