package day10;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer.Inner in = new Outer().new Inner();
		in.method();
		
		Outer out = new Outer();
		out.print();

		Outer.Inner2 in2 = new Outer.Inner2();
		in2.method();
	}

}

class Outer {
	private int n = 1;
	
	class Inner{
		public void method(){
			System.out.println(n);
		}
	}

	private class Inner1 {
		public void method() {
			System.out.println(n);
		}
	}
	
	static class Inner2{
		public void method(){
			System.out.println("Inner");
		}
	}

	public void print() {
		Inner1 in = new Inner1();
		in.method();
	}
}
