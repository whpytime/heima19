package day14;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "jinsanpang ������ ��dayone";
		String regex = " ";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
