package day14;

import java.math.BigDecimal;

public class Demo10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		demo1();
		System.out.println(2.0 - 1.1);//0.8999999999999999
		
		BigDecimal bd1 = new BigDecimal("2.0");//开发时推荐使用的除法代码
		BigDecimal bd2 = new BigDecimal("1.1");
		System.out.println(bd1.subtract(bd2));//0.9
	}

	private static void demo1() {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("*");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
