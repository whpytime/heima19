package day05;

import java.util.Scanner;

public class Demo2_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		int day = sc.nextInt();
		print(day);
	}
	
	public static void print(int day){
		System.out.println("����" + getWeek(day));
	}
	
	public static char getWeek(int day){
		char[] week = {' ', 'һ', '��', '��', '��', '��', '��', '��'};
		return week[day];
	}

}
