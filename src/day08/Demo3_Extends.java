package day08;

public class Demo3_Extends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.setName("ÕÅÈý");
		s.setAge(23);
		//s.age = 24;
		s.show();
		// s.test();
	}

}

class Father {
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

	public void show() {
		System.out.println("Father:" + name + "..." + age);
		// System.out.println(super.name + "..." + super.age);
	}

	// private void test() {
	// System.out.println("test");
	// }
}

class Son extends Father {
	// private void test() {
	// System.out.println("test");
	// }
	public int age;

	// public void show(){
	// //System.out.println(this.name + "..." + this.age);
	// //super.show();
	// }

	public void setAge(int age) {
		this.age = age;
	}
}
