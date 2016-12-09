package day25;

public class Printer2 {
	int flag = 1;
	

	public void print1() throws InterruptedException {
		synchronized (this) {
			if(flag != 1){
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("\r\n");
			flag = 2;
			this.notify();
	}}

	public void print2() throws InterruptedException {
		synchronized (this) {
			if(flag != 2){
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("\r\n");
			flag = 1;
			this.notify();
		}
	}
}
