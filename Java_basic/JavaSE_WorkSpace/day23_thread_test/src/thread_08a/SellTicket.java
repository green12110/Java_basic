package thread_08a;

/**
 * ĳ��ӰԺ��Ʊ��ֻ��100�ŵ�ӰƱ��ֻ��3����Ʊ����
 * ����Ƴ�һ������ģ��õ�ӰԺ��Ʊ
 * 
 * ʹ��ʵ��Runnable�ӿ�
 * @author Administrator
 *
 */

public class SellTicket implements Runnable {
	private  int count = 100; //����Ҫ��̬���� static
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(count >0){
				System.out.println(Thread.currentThread().getName()+
						           "���ڳ��۵ڣ�"+(count--)+"�ŵ�ӰƱ");
				
			}
			
		}
		
	}
	
	

}
