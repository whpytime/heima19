package day13;

public class Demo3 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("heima");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("heima");
		System.out.println(sb2);
		System.out.println("=================");
		
		String str1 = sb.toString();
		System.out.println(str1);
	}
}
