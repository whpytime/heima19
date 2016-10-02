package day06;

public class Demo2_Person {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
//		p.name = "张三";
//		p.age = 23;
		p.setName("李四");
		p.setAge(23);
		p.speak();
		System.out.println(p.getName() + "..." + p.getAge());
	}

}

class Person {
	private String name;
	private int age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setAge(int age){
		if(age >0 && age < 200){
			this.age = age;
		}
	}
	
	public int getAge(){
		return this.age;
	}

	public void speak() {
		// int num = 10;
		// System.out.println(name);
		// System.out.println(num);
		System.out.println(name + "..." + age);
	}
}
