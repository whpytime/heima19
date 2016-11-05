package day09;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA a = new AA();
//		a.printA();
//		a.printB();
		a.print();
	}

}

interface InterA{
	int num = 1;
	
	void print();
}

interface InterB{
	int num = 2;
	
	void print();
}

class AA implements InterA, InterB{
//	public void printA(){
//		System.out.println("AA implements Inter");
//	}
	
	public void print(){
		System.out.println(InterB.num);
	}
}

