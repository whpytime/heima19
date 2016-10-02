package day10;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer3 out = new Outer3();
		out.method();
	}

}

class Outer3 {
	public void method() {
		final int num = 10;

		class Inner31 {
			public void print() {
				System.out.println(num);
			}
		}

		Inner31 io = new Inner31();
		io.print();
	}

	// public void run(){
	// Inner31 i = new Inner31();
	// i.print();
	// }
}