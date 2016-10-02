package day17;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashSet<Character> hs = new HashSet<>();
		String line = s.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr) {
			hs.add(c);
		}
		
		System.out.println(hs);
	}

}
