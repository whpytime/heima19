package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 23);
		System.out.println(map.put("����", 24));
		map.put("����", 25);
		map.put("����", 26);
		
		System.out.println(map);
		
		System.out.println(map.remove("����"));
		System.out.println(map);
		System.out.println("===========");
		
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsValue(23));
		System.out.println(map.containsValue(24));
		System.out.println("================================");
		
		Collection<Integer> c = map.values();
		System.out.println(c);
		
	}

}
