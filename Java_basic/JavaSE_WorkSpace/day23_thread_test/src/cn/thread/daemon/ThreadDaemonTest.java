package cn.thread.daemon;

/**
 * 
 * setDaemon() �����̱߳��Ϊ�ػ��߳�
 * ��start֮ǰ����
 * @author Administrator
 *
 */

public class ThreadDaemonTest {
	
	public static void main(String[] args) {
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.setDaemon(true);
        th2.setDaemon(true);
        
		
		th1.setName("�ػ��߳�1");
		th2.setName("�ػ��߳�2");
		
		th1.start();
		th2.start();
		
		Thread.currentThread().setName("���߳�");
		for(int i =0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}

}
