package cn.thread_06;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0;x<10;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
			
		}
		
	}

}
