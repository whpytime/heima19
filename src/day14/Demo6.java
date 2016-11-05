package day14;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
//		demo2();
		String s = "我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
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
		System.out.println("快快乐乐".matches(regex));
	}

}
