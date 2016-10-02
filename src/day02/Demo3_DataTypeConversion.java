package day02;

public class Demo3_DataTypeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int x = 3;
//		byte b = 4;
//		
//		x = x + b;
//		System.out.println(x);
		
		
		short s1 = 1;
		short s2 = 2;
		short s3 = (short)(s1 + s2);
			
		int x = 3;
		byte b = 4;
		
		b = (byte)(b + x);
		System.out.println(b);
	}

}
