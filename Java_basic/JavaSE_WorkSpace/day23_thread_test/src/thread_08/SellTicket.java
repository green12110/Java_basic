package thread_08;
/**
 * ĳ��ӰԺ��Ʊ��ֻ��100�ŵ�ӰƱ��ֻ��3����Ʊ����
 * ����Ƴ�һ������ģ��õ�ӰԺ��Ʊ
 * 
 * ʹ�ü̳�Thread��
 * @author Administrator
 *
 */

public class SellTicket extends Thread{
	private static int count = 20;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*for(int i=0;i<count;count++){
			System.out.println("���۵ڣ�"+(i++)+"��Ʊ");
			count--;
			
		}*/
		
		while(true){
			if(count>0){
				
				System.out.println(getName()+":���۵�"+(count--)+"��Ʊ");
				
			}
			
			
		}
	}

}
