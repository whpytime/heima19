package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Demo11 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxxx.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("zzzz.txt"));

		int c;
		while ((c = br.read()) != -1) {
			bw.write(c);
		}

		br.close();
		bw.close();
	}

}
