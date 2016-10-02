package day16;

import java.util.LinkedList;

public class Stack {
	private LinkedList list = new LinkedList();
	
	public void push(Object obj){
		list.addFirst(obj);
	}
	
	public Object pop(){
		if(!list.isEmpty()){
			return list.removeFirst();
		}else{
			return null;
		}
	}
	
	public boolean isEmpty(){
		if(list.isEmpty()){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "" + list;
	}

}
