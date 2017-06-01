package cn.thread.yeild;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.setName("Êæä¿");
		th2.setName("ÀèÃ÷");
		
		th1.start();
		th2.start();
		
	}

}
