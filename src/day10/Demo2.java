package day10;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer2.Inner21 in21 = new Outer2().new Inner21();
		in21.show();
	}

}

class Outer2 {
	public int num = 10;

	class Inner21 {
		public int num = 20;

		public void show() {
			int num = 30;

			System.out.println(num);
			System.out.println(this.num);
			// System.out.println(new Outer2().num);
			System.out.println(Outer2.this.num);
		}
	}
}