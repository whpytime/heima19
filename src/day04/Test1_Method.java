package day04;

import java.util.Scanner;

public class Test1_Method {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第一个数：");
		int y = sc.nextInt();
		
//		int max = getMax(x, y);
//		System.out.println(max);
		
		boolean b = isEquals(x, y);
		System.out.println(b);
	}
	
	public static int getMax(int a, int b){
		return a > b ? a : b;
	}

	public static boolean isEquals(int a, int b){
		if(a == b){
			return true;
		}else{
			return false;
		}
	}
}
