package day12;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "ºÚÂíheimaheima4324#@DIOFUA$%$^";
		System.out.println(s1.length());
		System.out.println("1111111111111111");

		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf('z'));
		System.out.println(s1.indexOf("Âí"));
		System.out.println(s1.indexOf('a', 3));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("2222222222222222");
		System.out.println(s1.substring(3, 6));
		System.out.println("3333333333333333");

		int lowCharNum = 0;
		int upCharNum = 0;
		int num = 0;
		int otherNum = 0;
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				lowCharNum++;
			} else if (ch >= 'A' && ch <= 'Z') {
				upCharNum++;
			} else if (ch >= '0' && ch <= '9') {
				num++;
			} else {
				otherNum++;
			}
		}
		System.out.println(lowCharNum);
		System.out.println(upCharNum);
		System.out.println(num);
		System.out.println(otherNum);

	}

}
