package day12;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "sdfoiADfee2324#$%&";
		String str2 = "你好你好";

		byte[] arr1 = str1.getBytes();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("============");

		byte[] arr2 = str2.getBytes();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("=================");

		char[] arr3 = str1.toCharArray();
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("=================");

		char[] arr4 = { 'a', 'e', '4', '#' };
		String str3 = String.valueOf(arr4);
		System.out.println(str3);

		Person p = new Person("张三", 23);
		String str4 = String.valueOf(p);
		System.out.println(str4);
	}

}

class Person {
	private String name;
	private int age;

	public Person() {
		super();

	}

	public Person(String name, int age) {
		super();
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

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
