package day17;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> num = new HashSet<>();
		while(num.size() < 10){
			num.add(r.nextInt(20) + 1);
		}
		System.out.println(num);
	}

}
