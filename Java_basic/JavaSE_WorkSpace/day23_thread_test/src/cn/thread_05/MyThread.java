package cn.thread_05;

import java.util.Date;

public class MyThread extends Thread{
	public void run(){
		System.out.println("开始执行："+new Date());
		//休眠10秒钟
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("线程被终止了。。。");
		}
		
		System.out.println("结束执行："+new Date());
		
		
	}

}
