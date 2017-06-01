package cn.thread_08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable{
    private int tiket = 100;
    
    private Lock lock = new ReentrantLock();
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			try{
			lock.lock();
			
			if(tiket>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+":正在出售第"+(tiket--)+"张电影票");
				
			}
			}finally{
				lock.unlock();
			}
			
			
			
		}
		
	}

}
