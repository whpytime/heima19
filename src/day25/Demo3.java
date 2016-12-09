package day25;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

@SuppressWarnings("deprecation")
public class Demo3 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer();
		
		t.schedule(new MyTimerTask(), new Date(116, 11, 5, 15, 35, 40), 3000);
		
		while(true){
			Thread.sleep(1000);
			System.out.println(new Date());
		}
	}

}
