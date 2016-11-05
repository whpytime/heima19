package day09;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class AbstractA{
	public int numA = 1;
	
	abstract public void printA();
}

class CA extends AbstractA{
	public void printA(){
		System.out.println(this.numA);
	}
}