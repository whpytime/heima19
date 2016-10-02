package day05;

import java.util.Scanner;

public class Demo2_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int day = sc.nextInt();
		print(day);
	}
	
	public static void print(int day){
		System.out.println("星期" + getWeek(day));
	}
	
	public static char getWeek(int day){
		char[] week = {' ', '一', '二', '三', '四', '五', '六', '日'};
		return week[day];
	}

}
