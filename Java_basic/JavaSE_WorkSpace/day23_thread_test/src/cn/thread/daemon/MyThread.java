package cn.thread.daemon;

public class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(getName()+":"+i);
			
		}
	}

}
