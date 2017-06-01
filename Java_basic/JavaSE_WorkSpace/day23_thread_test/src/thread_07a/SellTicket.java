package thread_07a;

public class SellTicket implements Runnable {
	// 定义100张票
	// private int tickets = 20;
	private int tickets = 100;
    private int x=0;
	//创建锁对象
    private Object obj = new Object();
    private  Demo demo = new Demo();

	// 售票
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			if(x%2==0){
				
				synchronized (this) { //obj相当于锁，当线程1进来后，被锁住了
					
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ ":\t正在售出第" + (tickets--) + "张票");
					}

				}
			}else{
				
				sellTicketMethod();
				/*synchronized (demo) { //obj相当于锁，当线程1进来后，被锁住了
					
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ ":\t正在售出第" + (tickets--) + "张票");
					}

				}*/
				
			}
			
	}
}

	
	public synchronized void sellTicketMethod(){
		
			
			if (tickets > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()
						+ ":\t正在售出第" + (tickets--) + "张票");
			}
		
	}

}


class Demo{
	

}
