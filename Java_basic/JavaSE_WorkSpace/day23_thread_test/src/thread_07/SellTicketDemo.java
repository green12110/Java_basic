package thread_07;

public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTicket st = new SellTicket();
		Thread th1 = new Thread (st,"����1");
		Thread th2 = new Thread (st,"����2");
		Thread th3 = new Thread (st,"����3");
		
		
		th2.start();
		th1.start();		
		th3.start();
		

	}

}
