package thread_07;

public class SellTicketDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTicket st = new SellTicket();
		Thread th1 = new Thread (st,"´°¿Ú1");
		Thread th2 = new Thread (st,"´°¿Ú2");
		Thread th3 = new Thread (st,"´°¿Ú3");
		
		
		th2.start();
		th1.start();		
		th3.start();
		

	}

}
