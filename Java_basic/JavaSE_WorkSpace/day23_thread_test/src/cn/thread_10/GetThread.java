package cn.thread_10;

public class GetThread implements Runnable{
	
	private Student s;
	
	public GetThread(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(s.name+"---"+s.age);
		
	}
  
}
