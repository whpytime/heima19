package day16;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tool<Student> t = new Tool<>();
		
		t.setObj(new Student("张三", 23));
		t.show(new Student("李四", 24));
		System.out.println(t);
	}

}
