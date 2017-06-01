package cn.thread_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		pool.submit(new MyThread());
		pool.submit(new MyThread());
		pool.shutdown();
		
	}

}
