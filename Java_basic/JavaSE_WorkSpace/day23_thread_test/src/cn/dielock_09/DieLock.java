package cn.dielock_09;

public class DieLock extends Thread{
	
	private boolean flag;
	
	public DieLock(boolean flag){
		this.flag = flag;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(flag){
			synchronized(MyLock.objA){
				System.out.println("enter if objA");
				synchronized(MyLock.objB){
					System.out.println("enter if objB");
				}
				
			}
		}else{
			
			synchronized(MyLock.objB){
				System.out.println("enter else objB");
				synchronized(MyLock.objA){
					System.out.println("enter else objA");
				}
				
			}
			
		}
	}
	
	

}
