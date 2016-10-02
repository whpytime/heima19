package day16;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("111");
		stack.push("%%");
		
		System.out.println(stack);
		
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
