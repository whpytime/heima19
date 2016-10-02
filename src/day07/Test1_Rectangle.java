package day07;

public class Test1_Rectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle();
		r1.setWidth(5);
		r1.setHigh(4);
		System.out.println(r1.getLength() + "..." + r1.getArea());

		Rectangle r2 = new Rectangle(20, 10);
		System.out.println(r2.getLength() + "..." + r2.getArea());
	}

}

class Rectangle {
	private int width;
	private int high;

	public Rectangle() {

	}

	public Rectangle(int width, int high) {
		this.width = width;
		this.high = high;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public int getLength() {
		return width * 2 + high * 2;
	}

	public int getArea() {
		return width * high;
	}

}