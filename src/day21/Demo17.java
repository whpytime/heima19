package day21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo17 {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		br.close();

		int c = Integer.parseInt(line);
		if (c > 0) {
			System.out.println("还有" + (c--) + "次使用机会。");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(c + "");
			fw.close();
		} else {
			System.out.println("使用次数已经用完，请购买正版软件。");
		}

	}

}
