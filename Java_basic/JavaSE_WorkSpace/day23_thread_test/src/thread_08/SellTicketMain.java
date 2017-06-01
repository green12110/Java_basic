package thread_08;

public class SellTicketMain {
	
	public static void main(String[] args) {
		SellTicket th1 = new SellTicket();
		SellTicket th2 = new SellTicket();
		SellTicket th3 = new SellTicket();
		
		th1.setName("售票窗口1");
		th2.setName("售票窗口2");
		th3.setName("售票窗口3");
		
		th1.start();
		th2.start();
		th3.start();
		
		
	}

}
