package cn.thread_06;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my = new MyRunnable();
		
		Thread th1 = new Thread(my,"������");
		Thread th2 = new Thread(my,"�");
		
		th1.start();
		th2.start();
		
		
	}

}
