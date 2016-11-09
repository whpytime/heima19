package day18;

import java.util.ArrayList;
import java.util.Collections;

public class Test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] color = {"黑桃", "红桃", "方片", "梅花"};
		ArrayList<String> poker = new ArrayList<>();
		
		for(String s1 : num){
			for(String s2 : color){
				poker.add(s2.concat(s1));
			}
		}
		
		poker.add("大王");
		poker.add("小王");
//		System.out.println(poker.size());
		
		Collections.shuffle(poker);
//		System.out.println(poker);
		
		ArrayList<String> u1 = new ArrayList<>();
		ArrayList<String> u2 = new ArrayList<>();
		ArrayList<String> u3 = new ArrayList<>();
		ArrayList<String> back = new ArrayList<>();
		
		for(int i = 0; i < poker.size(); i ++){
//			u1.add(poker.get(i));
//			u2.add(poker.get(i + 1));
//			u3.add(poker.get(i + 2));
			
			if(i >= poker.size() - 3){
				back.add(poker.get(i));
			}else if(i % 3 == 0){
				u1.add(poker.get(i));
			}else if(i % 3 == 1){
				u2.add(poker.get(i));
			}else{
				u3.add(poker.get(i));
			}
		}		
		
		System.out.println(u1);
		System.out.println(u1.size());
		System.out.println(u2);
		System.out.println(u2.size());
		System.out.println(u3);
		System.out.println(u3.size());
		System.out.println(back);
	}

}
