package thread_07;

public class SellTicket implements Runnable {
	// ����100��Ʊ
	// private int tickets = 20;
	private int tickets = 100;
    
	//����������
    private Object obj = new Object();

	// ��Ʊ
	public void run() {
		// TODO Auto-generated method stub

		while (true) {
			synchronized (obj) { //obj�൱���������߳�1�����󣬱���ס��
				
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

			}// �߳�1�����󣬸ı�״̬�������������߳̽���
		}
	}
}
