package day09;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA a = new BBB();
		a.show();
		
		BBB b = new CCC();
		b.show();
	}

}

class AAA {
	public void show() {
		show2();
	}

	public void show2() {
		System.out.println("AAA");
	}
}

class BBB extends AAA {
	public void show2() {
		System.out.println("bbb");
	}
}

class CCC extends BBB {
	public void show() {
		super.show();
	}

	public void show2() {
		System.out.println("CCC");
	}
}
