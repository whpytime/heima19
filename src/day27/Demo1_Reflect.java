package day27;

public class Demo1_Reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = Class.forName("day27.Person");
		Class clazz2 = Person.class;
		
		Person p = new Person();
		Class clazz3 = p.getClass();
		
		System.out.println(clazz1 == clazz2);
		System.out.println(clazz2 == clazz3);
	}

}
