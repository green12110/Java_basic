package thread_07;

public class SellTicket implements Runnable {
	// 定义100张票
	// private int tickets = 20;
	private int tickets = 100;
    
	//创建锁对象
    private Object obj = new Object();

	// 售票
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			synchronized (obj) { //obj相当于锁，当线程1进来后，被锁住了
				
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

			}// 线程1出来后，改变状态，开门让其他线程进来
		}
	}
}
