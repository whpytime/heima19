package day07;

/**
 * 这是一个数组工具类，封装了：查找最大值，打印，翻转等功能
 * 
 * @author Administrator
 * @version v1.0
 */
public class ArrayTool {
	/**
	 * 私有构造方法
	 */
	private ArrayTool() {

	}

	/**
	 * 1、获取最大值
	 * 
	 * @param arr
	 *            接收一个int类型的数组
	 * @return 返回数组中的最大值
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	/**
	 * 2、打印数组
	 * 
	 * @param arr
	 *            接收一个int类型的数组
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 3、翻转数组
	 * 
	 * @param arr
	 *            接收一个int类型的数组
	 */
	public static void revArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
