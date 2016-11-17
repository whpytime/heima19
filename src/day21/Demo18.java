package day21;

public class Demo18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(diGui(5));
	}

	
	public static int diGui(int n){
		if(n == 1){
			return n;
		}else{
			return n * diGui(n - 1);
		}
	}
}
