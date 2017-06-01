package thread_08a;

/**
 * 某电影院售票，只有100张电影票，只有3个售票窗口
 * 请设计出一个程序模拟该电影院售票
 * 
 * 使用实现Runnable接口
 * @author Administrator
 *
 */

public class SellTicket implements Runnable {
	private  int count = 100; //不需要静态修饰 static
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(count >0){
				System.out.println(Thread.currentThread().getName()+
						           "正在出售第："+(count--)+"张电影票");
				
			}
			
		}
		
	}
	
	

}
