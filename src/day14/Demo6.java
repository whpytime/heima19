package day14;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		String s = "����....��...��.Ҫ...ҪҪ...Ҫѧ....ѧѧ..ѧ.��..���.��.��.��.��..��";
		String s2 = s.replaceAll("\\.+", "");
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		System.out.println(s3);
		
	}

	private static void demo2() {
		String s = "sdqqkgkkkhjppppkl";
		String regex = "(.)\\1+";
		String[] arr = s.split(regex);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void demo1() {
		String regex = "(.)\\1(.)\\2";
		System.out.println("�������".matches(regex));
	}

}
