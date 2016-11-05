package day14;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s  = "wo1ai2heima";
		String regex = "\\d";
		String s2 = s.replaceAll(regex, "");
		System.out.println(s2);
	}

}
