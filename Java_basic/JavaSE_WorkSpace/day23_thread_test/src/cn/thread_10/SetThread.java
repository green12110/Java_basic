package cn.thread_10;

public class SetThread implements Runnable{
	
	private Student s;
	
	public SetThread(Student s){
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	     s.name = "Éî´¨";
	     s.age = 20;
		
	}
	
	

}
