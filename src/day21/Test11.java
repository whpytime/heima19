package day21;

import java.io.File;
import java.util.Scanner;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dir = getDir();
		printJavaFile(dir);

	}

	private static File getDir() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("������·����");
			String line = sc.nextLine();
			File dir = new File(line);

			if (!dir.exists()) {
				System.out.println("·��������");
			} else if (dir.isFile()) {
				System.out.println("�����ļ���������·��");
			} else {
				return dir;
			}
		}
	}
	
	private static void printJavaFile(File dir){
		File[] subFiles = dir.listFiles();
		
		for (File subFile : subFiles) {
			if(subFile.isFile() && subFile.getName().endsWith(".java")){
				System.out.println(subFile);
			}else if(subFile.isDirectory()){
				printJavaFile(subFile);
			}else{
				
			}
		}
	}

}
