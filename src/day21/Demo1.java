package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("xxx.txt");
//		int x = fr.read();
//		System.out.println(x);
//		
//		char ch = (char)x;
//		System.out.println(ch);
//		fr.close();
		
		int x ;
		while((x = fr.read()) != -1){
			System.out.println((char)x);
		}

	}

}
