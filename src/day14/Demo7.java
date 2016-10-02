package day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "奥迪富奥飞18812345678, sdflkjadsf18912345678，离开的数据发送到13912345678";
		String regex = "1[3578]\\d{9}";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);

		while (m.find()) {
			System.out.println(m.group());
		}
	}

}
