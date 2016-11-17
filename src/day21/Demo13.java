package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Demo13 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("cba.txt"));
		ArrayList<String> list = new ArrayList<>();
		// LinkedList<String> list = new LinkedList<>();
		String line;

		while ((line = br.readLine()) != null) {
			list.add(line);
		}

		// for (String string : list) {
		// bw.write(string);
		// bw.newLine();
		// }

		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
			bw.newLine();
		}

		br.close();
		bw.close();
	}

}
