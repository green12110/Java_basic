package day23_thread;

public class MyThread extends Thread{
	@Override
	public void run() {
		//�����߳�ִ�еĴ���
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}

}
