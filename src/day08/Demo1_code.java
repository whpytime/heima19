package day08;

public class Demo1_code {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		Person p2 = new Person("����", 23);
	}

}

class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("�ղι��캯��");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("�вι��캯��");
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
		System.out.println("��������");
	}

	static {
		System.out.println("��̬�����");
	}

}