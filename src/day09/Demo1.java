package day09;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal a = new Cat();
//		a.eat();
//		System.out.println(a.num);
//		a.eat();
//		a.print();
		method(new Cat());
		method(new Dog());

	}
	
	public static void method(Animal a){
		a.eat();
	}
	

}

class Animal {
	private String color;
	private int leg;
	int num = 10;

	public Animal() {
		System.out.println("Animal �ղι���");
	}

	public Animal(String color, int leg) {
		this.color = color;
		this.leg = leg;
		System.out.println("Animal �вι���");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public void eat() {
		System.out.println("Animal eat");
	}
	
	public void print(){
		System.out.println(num);
	}

}

class Cat extends Animal {
	int num = 20;
	
	public Cat() {
		System.out.println("Cat �ղι���");
	}

	public Cat(String color, int leg) {
		super.setColor(color);
		super.setLeg(leg);
		System.out.println("Cat �вι���");
	}

	public void eat() {
		System.out.println("Cat eat");
	}
	
	public void print(){
		System.out.println(num);
	}
	
	public void catchMouse(){
		System.out.println("Cat catchMouse");
	}
}

class Dog extends Animal{
	public void eat(){
		System.out.println("Dog eat");
	}
	
	public void lookHome(){
		System.out.println("Dog lookHome");
	}
}