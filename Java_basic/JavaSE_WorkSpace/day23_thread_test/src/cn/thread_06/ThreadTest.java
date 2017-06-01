package cn.thread_06;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my = new MyRunnable();
		
		Thread th1 = new Thread(my,"·¶±ù±ù");
		Thread th2 = new Thread(my,"Àî³¿");
		
		th1.start();
		th2.start();
		
		
	}

}
