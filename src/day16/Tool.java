package day16;

public class Tool<E> {
	private E e;
	
	public E getObj(){
		return e;
	}
	
	public void setObj(E e){
		this.e = e;
	}

	@Override
	public String toString() {
		return "Tool [e=" + e + "]";
	}

	public void show(E e){
		System.out.println(e);
	}
}
