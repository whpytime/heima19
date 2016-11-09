package day19;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int[] arr = {11, 22, 33, 44, 55};
		
//		try {
//			System.out.println(arr[10]);;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			System.out.println("err!");
//		}catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("error!");
//		}
		
		try {
			System.out.println(arr[10]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error!");
		}
	}

}
