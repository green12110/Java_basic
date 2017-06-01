package cn.thread_04;

public class ThreadJoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJionThread th1 = new MyJionThread();
		MyJionThread th2 = new MyJionThread();
		MyJionThread th3 = new MyJionThread();
		
		th1.setName("线程1");
		th2.setName("线程2");
		th3.setName("线程3");
		
		/*th1.start();
		th2.start();
		th3.start();*/
		
		
	    th1.start();
	    // join()作用，必须等th1执行完成之后，其他线程才可以继续
	    try {
	    	th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    th2.start();
	    th3.start();
		

	}

}
