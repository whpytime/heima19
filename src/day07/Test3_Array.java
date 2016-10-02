package day07;

public class Test3_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 22, 77, 344, 8, 223, 6, 22, 5555, 2, 0 };
		ArrayTool.print(arr);
		System.out.println(ArrayTool.getMax(arr));
		ArrayTool.revArray(arr);
		ArrayTool.print(arr);
	}

}
