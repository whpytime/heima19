package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo12 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("def.txt"));
		String line;
		
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
			System.out.println(line);
		}
		
		br.close();
		bw.close();
	}

}
