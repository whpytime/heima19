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
			System.out.println("�������û�����");
			String userName = sc.nextLine();
			System.out.println("���������룺");
			String userPassword = sc.nextLine();
			if (userName.equals(uName) && userPassword.equals(uPassword)) {
				System.out.println("��½�ɹ�");
				break;
			} else {
				if (i < 2) {
					System.out.println("�û������������������" + (3 - i - 1) + "�λ���");
				} else {
					System.out.println("�˳�");
					break;
				}
			}

		}

	}

}
