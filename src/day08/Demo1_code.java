package day08;

public class Demo1_code {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		Person p2 = new Person("李四", 23);
	}

}

class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("空参构造函数");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有参构造函数");
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

	{
		System.out.println("构造代码块");
	}

	static {
		System.out.println("静态代码块");
	}

}