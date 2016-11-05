package day13;

public class Demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toOctalString(60));
		System.out.println(Integer.toHexString(60));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("=============================");
		
		System.out.println(new Integer("1234"));
		int i = 100;
		String s1 = i + "";
		String s2 = String.valueOf(i);
		String s3 = new Integer(i).toString();
		String s4 = Integer.toString(i);
		
		System.out.println("=============================");
		
		Integer i2 = new Integer("100");
		int i3 = i2.intValue();
		int i4 = Integer.parseInt("200");
		
		
	}

}
