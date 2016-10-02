package day09;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new B();
		a.print();
	}

}

class A {
	int num = 1;

	public void print() {
		// System.out.println(num);
		show();
	}

	public void show() {
		System.out.println("A show");
		System.out.println(num);
	}
}

class B extends A {
	int num = 2;

	public void show() {
		System.out.println("B show");
		System.out.println(num);
	}
}