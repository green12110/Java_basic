package cn.thread_04;

public class ThreadJoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyJionThread th1 = new MyJionThread();
		MyJionThread th2 = new MyJionThread();
		MyJionThread th3 = new MyJionThread();
		
		th1.setName("�߳�1");
		th2.setName("�߳�2");
		th3.setName("�߳�3");
		
		/*th1.start();
		th2.start();
		th3.start();*/
		
		
	    th1.start();
	    // join()���ã������th1ִ�����֮�������̲߳ſ��Լ���
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
