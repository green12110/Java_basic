package cn.thread_01;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.setName("������");
		th2.setName("�");
		
		th1.start();
		th2.start();
		
		/*String s = Thread.currentThread().getName();
		System.out.println(s);*/
	}

}
