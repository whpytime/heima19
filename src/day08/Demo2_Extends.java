package day08;

public class Demo2_Extends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		c.color = "white";
		c.leg = 4;

		System.out.println(c.color + "..." + c.leg);
		c.sleep();
		c.eat();
	}
}

class Animal {
	String color;
	int leg;
	String name;

	public void eat() {
		System.out.println("�Է�");
	}

	public void sleep() {
		System.out.println("˯��");
	}
}

class Cat extends Animal {

}

class Dog extends Animal {

}