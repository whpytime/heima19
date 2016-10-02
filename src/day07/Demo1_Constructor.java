package day07;

public class Demo1_Constructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.show();
		System.out.println("================");
		
		Person p2 = new Person("李四", 23);
		p2.show();
		System.out.println(p2.getName() + "..." + p2.getAge());
		System.out.println("================");
		
		Person p3 = new Person();
		p3.setName("王五");
		p3.setAge(25);
		p3.show();
		
	}

}

class Person {
	private String name;
	private int age;

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

	public Person() {
		// System.out.println("Hello World");
		// return;

		this.name = "张三";
		this.age = 18;
	}
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println(this.name + "..." + this.age);
	}
}