package day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Demo14 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("abc.txt"));
		String line;
		
		while((line = lnr.readLine()) != null){
			System.out.println(lnr.getLineNumber() + " : " + line);
		}
		
		lnr.close();
	}

}
