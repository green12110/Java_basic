package thread_07a;

public class SellTicket implements Runnable {
	// ����100��Ʊ
	// private int tickets = 20;
	private int tickets = 100;
    private int x=0;
	//����������
    private Object obj = new Object();
    private  Demo demo = new Demo();

	// ��Ʊ
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			if(x%2==0){
				
				synchronized (this) { //obj�൱���������߳�1�����󣬱���ס��
					
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ ":\t�����۳���" + (tickets--) + "��Ʊ");
					}

				}
			}else{
				
				sellTicketMethod();
				/*synchronized (demo) { //obj�൱���������߳�1�����󣬱���ס��
					
					if (tickets > 0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()
								+ ":\t�����۳���" + (tickets--) + "��Ʊ");
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
						+ ":\t�����۳���" + (tickets--) + "��Ʊ");
			}
		
	}

}


class Demo{
	

}
