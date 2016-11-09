package day19;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo d = new Demo();
		try{
			int x = d.div(10, 0);
			System.out.println(x);
		}catch(ArithmeticException a){
			System.out.println("err!");
		}
	}

}
