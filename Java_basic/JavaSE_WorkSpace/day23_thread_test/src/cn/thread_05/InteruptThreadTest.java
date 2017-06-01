package cn.thread_05;

public class InteruptThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread th1 = new MyThread();
		
		th1.start();
		//休眠时间10秒太长，如果休眠3秒后，线程终止
		try {
			Thread.sleep(3000);
			//th1.stop();
			th1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//th1.interrupt();

	}

}
