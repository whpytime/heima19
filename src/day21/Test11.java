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
			System.out.println("请输入路径：");
			String line = sc.nextLine();
			File dir = new File(line);

			if (!dir.exists()) {
				System.out.println("路径不存在");
			} else if (dir.isFile()) {
				System.out.println("不是文件，请输入路径");
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
