package day12;

public class Demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "  adsf  eLKO  IfdLfd  safl  LIOJ ";

		String s1 = s.substring(0, 1);
		String s2 = s.substring(1, s.length());
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println(s3);
		
		String s4  = s.substring(0, 1).toUpperCase().concat(s.substring(1, s.length()).toLowerCase());
		System.out.println(s4);
		
		System.out.println("=====================");
		String s5 = s.replace('a', 'A');
		System.out.println(s5);
		
//		String s6 = s.replace("ad", "xxx");
//		System.out.println(s6);
		
		String s7 = s.trim();
		System.out.println(s7);		
		System.out.println("=====================");
		
		
		
	}

}
