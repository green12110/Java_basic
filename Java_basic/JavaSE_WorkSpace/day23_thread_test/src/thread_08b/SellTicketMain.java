package thread_08b;

public class SellTicketMain {
	public static void main(String[] args) {
		SellTicket runnable = new SellTicket();
		Thread th1 = new Thread(runnable,"����1");
		Thread th2 = new Thread(runnable,"����2");
		Thread th3 = new Thread(runnable,"����3");
		
		th1.start();
		th2.start();
		th3.start();
	}

}
