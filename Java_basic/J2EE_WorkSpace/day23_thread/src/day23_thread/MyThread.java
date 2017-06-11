package day23_thread;

public class MyThread extends Thread{
	@Override
	public void run() {
		//被多线程执行的代码
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

}
