package day07;

/**
 * ����һ�����鹤���࣬��װ�ˣ��������ֵ����ӡ����ת�ȹ���
 * 
 * @author Administrator
 * @version v1.0
 */
public class ArrayTool {
	/**
	 * ˽�й��췽��
	 */
	private ArrayTool() {

	}

	/**
	 * 1����ȡ���ֵ
	 * 
	 * @param arr
	 *            ����һ��int���͵�����
	 * @return ���������е����ֵ
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
	 * 2����ӡ����
	 * 
	 * @param arr
	 *            ����һ��int���͵�����
	 */
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * 3����ת����
	 * 
	 * @param arr
	 *            ����һ��int���͵�����
	 */
	public static void revArray(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}
}
