package day17;

public class Student extends Person {

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
