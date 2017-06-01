package cn.thread.daemon;

/**
 * 
 * setDaemon() 将该线程标记为守护线程
 * 在start之前调用
 * @author Administrator
 *
 */

public class ThreadDaemonTest {
	
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.setDaemon(true);
        th2.setDaemon(true);
        
		
		th1.setName("守护线程1");
		th2.setName("守护线程2");
		
		th1.start();
		th2.start();
		
		Thread.currentThread().setName("主线程");
		for(int i =0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
