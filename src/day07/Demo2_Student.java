package day07;

public class Demo2_Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(23);
		s1.show();
		System.out.println(s1.getName() + "..." + s1.getAge());

		Student s2 = new Student("李四", 24);
		s2.show();

		System.out.println("================");

		Phone p1 = new Phone();
		p1.setBrand("苹果");
		p1.setPrice(1500);
		p1.show();

		Phone p2 = new Phone("小米", 98);
		p2.show();

	}

}

class Student {
	private String name;
	private int age;

	public Student() {

	}

	public Student(String name, int age) {
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

	public void show() {
		System.out.println("我的姓名是：" + this.name + "，我的年龄是：" + this.age);
	}

}

class Phone {
	private String brand;
	private int price;

	public Phone() {

	}

	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void show() {
		System.out.println(this.brand + "..." + this.price);
	}

}
