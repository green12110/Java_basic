package cn.thread.yeild;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.setName("���");
		th2.setName("����");
		
		th1.start();
		th2.start();
		
	}

}
