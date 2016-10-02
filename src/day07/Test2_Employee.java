package day07;

public class Test2_Employee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee("Áîºü³å", 9527, 20000);
		e.show();
	}

}

class Employee {
	private String name;
	private int id;
	private int price;

	public Employee() {

	}

	public Employee(String name, int id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void show() {
		System.out.println(this.name + "..." + this.id + "..." + this.price);
	}
}