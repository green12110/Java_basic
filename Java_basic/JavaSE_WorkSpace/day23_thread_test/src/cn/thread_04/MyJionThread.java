package cn.thread_04;

public class MyJionThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
		System.out.println(getName()+":"+i);
		}
	}

}
