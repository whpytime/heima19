package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] num = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2" };
		String[] color = { "梅花", "方片", "红桃", "黑桃" };
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;

		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s2.concat(s1));
				list.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);

		Collections.shuffle(list);

		TreeSet<Integer> u1 = new TreeSet<>();
		TreeSet<Integer> u2 = new TreeSet<>();
		TreeSet<Integer> u3 = new TreeSet<>();
		TreeSet<Integer> back = new TreeSet<>();

		for (int i = 0; i < list.size(); i++) {
			if (i >= list.size() - 3) {
				back.add(list.get(i));
			} else if (i % 3 == 0) {
				u1.add(list.get(i));
			} else if (i % 3 == 1) {
				u2.add(list.get(i));
			} else {
				u3.add(list.get(i));
			}
		}

		lookPoker(hm, u1, "u1");
		lookPoker(hm, u2, "u2");
		lookPoker(hm, u3, "u3");
		lookPoker(hm, back, "back");
		
	}

	public static void lookPoker(HashMap<Integer, String> hm,
			TreeSet<Integer> ts, String name) {
		System.out.print(name + "的牌是：\t");
		for (Integer i : ts) {
			System.out.print(hm.get(i) + "\t");

		}
		System.out.println();
	}
}
