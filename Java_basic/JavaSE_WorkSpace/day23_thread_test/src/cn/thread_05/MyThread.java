package cn.thread_05;

import java.util.Date;

public class MyThread extends Thread{
	public void run(){
		System.out.println("��ʼִ�У�"+new Date());
		//����10����
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("�̱߳���ֹ�ˡ�����");
		}
		
		System.out.println("����ִ�У�"+new Date());
		
		
	}

}
