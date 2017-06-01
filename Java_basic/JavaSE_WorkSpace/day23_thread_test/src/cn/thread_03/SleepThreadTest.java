package cn.thread_03;

public class SleepThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		MyThread th3 = new MyThread();
		
		th1.setName("线程1");
		th2.setName("线程2");
		th3.setName("线程3");
		
		th1.start();
		th2.start();
		th3.start();

	}

}
