package day23_thread;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer2 {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new myTimerTask2(), 5000,2000);
	}

}


class myTimerTask2 extends TimerTask{
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("定时执行了.....");
		
	}
	
	
}
