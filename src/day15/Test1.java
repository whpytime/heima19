package day15;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student("张三", 23);
		arr[1] = new Student("李四", 24);
		arr[2] = new Student("王五", 25);
		arr[3] = new Student("赵六", 26);
		arr[4] = new Student("马哥", 27);
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (Student student : arr) {
			System.out.println(student);
		}
	}

}

