package day06;

public class Demo1_Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Student s = new Student();
		// s.name = "����";
		// s.age = 23;
		// System.out.println(s.name + "..." + s.age);
		// s.study();
		// s.sleep();
		//
		// System.out.println("===============");
		//
		// Phone p = new Phone();
		// p.brand = "��Ϊ";
		// p.price = 1000;
		// System.out.println(p.brand + "..." + p.price);
		// p.call();
		// p.sendMessage();
		//
		// System.out.println("===============");

		Car c1 = new Car();
		c1.color = "red";
		c1.num = 4;
		c1.run();

		Car c2 = new Car();
		c2.color = "black";
		c2.num = 8;
		c2.run();

		// c2 = null;
		// c2.run();

		Car c3 = c2;
		c3.run();

		new Car().run();

	}

}

// class Student {
// String name;
// int age;
// String gender;
//
// public void study() {
// System.out.println("ѧ��ѧϰ");
// }
//
// public void sleep() {
// System.out.println("ѧ��˯��");
// }
// }
//
// class Phone {
// String brand;
// int price;
//
// public void call() {
// System.out.println("�ֻ���绰");
// }
//
// public void sendMessage() {
// System.out.println("�ֻ�����Ϣ");
// }
//
// public void playGame() {
// System.out.println("�ֻ�����Ϸ");
// }
// }

class Car {
	String color;
	int num;

	public void run() {
		System.out.println(color + "..." + num);
	}
}
