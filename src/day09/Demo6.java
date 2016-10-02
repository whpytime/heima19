package day09;

public class Demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatA c = new CatA("º”∑∆", 8);
		c.eat();
		c.sleep();
		System.out.println("---------------------");

		JumpCat jc = new JumpCat("∑ √®", 4);
		jc.eat();
		jc.sleep();
		jc.jump();
	}
}

abstract class AnimalA {
	private String name;
	private int age;

	public AnimalA() {

	}

	public AnimalA(String name, int age) {
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

	abstract public void sleep();

}

interface Jumping {
	public void jump();
}

class CatA extends AnimalA {
	public CatA() {

	}

	public CatA(String name, int age) {
		super(name, age);
	}

	public void eat() {
		System.out.println("CatA eat");
	}

	public void sleep() {
		System.out.println("CatA sleep");
	}
}

class JumpCat extends CatA implements Jumping {
	public JumpCat() {

	}

	public JumpCat(String name, int age) {
		super(name, age);
	}

	public void jump() {
		System.out.println("JumpCat jump");
	}
}