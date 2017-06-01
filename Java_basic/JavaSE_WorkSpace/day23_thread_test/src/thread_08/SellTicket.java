package thread_08;
/**
 * 某电影院售票，只有100张电影票，只有3个售票窗口
 * 请设计出一个程序模拟该电影院售票
 * 
 * 使用继承Thread类
 * @author Administrator
 *
 */

public class SellTicket extends Thread{
	private static int count = 20;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*for(int i=0;i<count;count++){
			System.out.println("出售第："+(i++)+"张票");
			count--;
			
		}*/
		
		while(true){
			if(count>0){
				
				System.out.println(getName()+":出售第"+(count--)+"张票");
				
			}
			
			
		}
	}

}
