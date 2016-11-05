package day09;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat1 c = new Cat1("¼Ó·Æ", 8);
		System.out.println(c.getName() + "..." + c.getAge());
		c.eat();
		c.catchMouse();
		System.out.println("=============");
		Dog1 d = new Dog1("°Ë¹«", 10);
		System.out.println(d.getName() + "..." + d.getAge());
		d.eat();
		d.lookHome();
	}

}

abstract class Animal1 {
	private String name;
	private int age;

	public Animal1() {

	}

	public Animal1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	abstract public void eat();
}

class Cat1 extends Animal1 {
	public Cat1() {

	}

	public Cat1(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("Cat eat");
	}

	public void catchMouse() {
		System.out.println("Cat catchMouse");
	}
}

class Dog1 extends Animal1 {
	public Dog1() {

	}

	public Dog1(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("Dog eat");
	}

	public void lookHome() {
		System.out.println("Dog lookHome");
	}
}