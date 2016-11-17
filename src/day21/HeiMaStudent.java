package day21;

public class HeiMaStudent implements Coder {
	private Student s;
	
	public HeiMaStudent(Student s){
		this.s = s;
	}

	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("database");
		System.out.println("...");
	}
	
}
