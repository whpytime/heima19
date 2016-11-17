package day24;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i < 100000; i++){
			new MyThread();
		}
		
		for(int i = 0; i < 10000; i ++){
			System.out.println("Ö÷½ø³Ì£¡£¡£¡");
		}
	}

}
