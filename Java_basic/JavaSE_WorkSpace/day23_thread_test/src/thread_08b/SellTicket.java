package thread_08b;

/**
 * 某电影院售票，只有100张电影票，只有3个售票窗口
 * 请设计出一个程序模拟该电影院售票
 * 
 * 使用实现Runnable接口
 * @author Administrator
 * 
 * 实际中，网络不能实时传输数据，有延迟现象。所以将每卖出一张票后延迟100毫秒
 *
 */


public class SellTicket implements Runnable {
	private  int count = 100; //不需要静态修饰 static
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			if(count >0){
				//模拟真实的情景，做延迟
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+
						           "正在出售第："+(count--)+"张电影票");
				
			}
			
		}
		
	}
	
	

}
