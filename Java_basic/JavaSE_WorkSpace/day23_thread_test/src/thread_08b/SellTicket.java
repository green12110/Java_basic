package thread_08b;

/**
 * ĳ��ӰԺ��Ʊ��ֻ��100�ŵ�ӰƱ��ֻ��3����Ʊ����
 * ����Ƴ�һ������ģ��õ�ӰԺ��Ʊ
 * 
 * ʹ��ʵ��Runnable�ӿ�
 * @author Administrator
 * 
 * ʵ���У����粻��ʵʱ�������ݣ����ӳ��������Խ�ÿ����һ��Ʊ���ӳ�100����
 *
 */


public class SellTicket implements Runnable {
	private  int count = 100; //����Ҫ��̬���� static
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(count >0){
				//ģ����ʵ���龰�����ӳ�
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+
						           "���ڳ��۵ڣ�"+(count--)+"�ŵ�ӰƱ");
				
			}
			
		}
		
	}
	
	

}
