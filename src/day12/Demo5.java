package day12;

import java.util.Scanner;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String uName = "admin";
		String uPassword = "admin";

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入用户名：");
			String userName = sc.nextLine();
			System.out.println("请输入密码：");
			String userPassword = sc.nextLine();
			if (userName.equals(uName) && userPassword.equals(uPassword)) {
				System.out.println("登陆成功");
				break;
			} else {
				if (i < 2) {
					System.out.println("用户名或密码错误，您还有" + (3 - i - 1) + "次机会");
				} else {
					System.out.println("退出");
					break;
				}
			}

		}

	}

}
