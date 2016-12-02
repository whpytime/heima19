package day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Demo16 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
//		demo1();
		
//		demo2();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
		
		int c;
		while((c = br.read()) != -1){
			bw.write(c);
		}
		
		br.close();
		bw.close();
		
	}

	private static void demo2() throws UnsupportedEncodingException,
			FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("gbk.txt"), "gbk");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("utf-8.txt"), "uTf-8");
		
		int c;
		while((c = isr.read()) != -1){
			osw.write(c);
		}
		
		isr.close();
		osw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("gbk.txt");
		FileWriter fw = new FileWriter("utf-8.txt");
		
		int c;
		while((c = fr.read()) != -1){
			fw.write(c);
		}
		fr.close();
		fw.close();
	}

}
