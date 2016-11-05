package day10;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface Inter {
	public void print();
}

class Outer4 {
	class Inner41 implements Inter {
		public void print() {
			System.out.println("print");
		}
	}

	public void method() {
		Inner41 i = new Inner41();
		i.print();
	}
}