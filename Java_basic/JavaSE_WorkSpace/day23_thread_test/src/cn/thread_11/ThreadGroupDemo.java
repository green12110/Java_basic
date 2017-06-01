package cn.thread_11;

public class ThreadGroupDemo {
	
	public static void main(String[] args) {
		//method1();
		method2();
	}
	
	private static void method2() {
		ThreadGroup tg = new ThreadGroup("新线程组");
        MyThread mh = new MyThread();
		
		Thread th1 = new Thread(tg,mh,"Thread_A"); 
		Thread th2 = new Thread(tg,mh,"Thread_B");
		System.out.println(th1.getThreadGroup().getName());
		System.out.println(th2.getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		tg.setDaemon(true);
		
	}

	private static void method1() {
		MyThread mh = new MyThread();
		
		Thread th1 = new Thread(mh,"Thread_A"); 
		Thread th2 = new Thread(mh,"Thread_B");
		
		ThreadGroup tg1 = th1.getThreadGroup();
		ThreadGroup tg2 = th2.getThreadGroup();
		
		String name1= tg1.getName();
		String name2=tg2.getName();
		
		System.out.println(name1+"---"+name2);
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
	}

}
