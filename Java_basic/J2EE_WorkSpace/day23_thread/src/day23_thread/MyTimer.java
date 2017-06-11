package day23_thread;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimer {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.schedule(new myTimerTask(timer), 5000);
	}

}


class myTimerTask extends TimerTask{
	
	private Timer t;
	
	public myTimerTask(){
		
	}
	
	public myTimerTask(Timer t){
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("定时执行了.....");
	    t.cancel();
		
	}
	
	
}
