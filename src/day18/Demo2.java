package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
//		Set<String> keySet = map.keySet();
//		Iterator<String> it = keySet.iterator();
//		while(it.hasNext()){
//			String key = it.next();
//			Integer value = map.get(key);
//			System.out.println(key + " = " + value);
//		}
		
		for(String string : map.keySet()){
			System.out.println(string + " = " + map.get(string));
		}
	}

}
