package cn.thread_08;

public class LockDemo {
	
	public static void main(String[] args) {
		SellTicket sellTicketThread = new SellTicket();
		Thread th1 = new Thread(sellTicketThread,"´°¿Ú1");
		Thread th2 = new Thread(sellTicketThread,"´°¿Ú2");
		Thread th3 = new Thread(sellTicketThread,"´°¿Ú3");
		
		th1.start();
		th2.start();
		th3.start();
		
		
		
	}

}
