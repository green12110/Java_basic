package cn.thread_10;

public class StudentDemo {
	
	public static void main(String[] args) {
		Student s= new Student();
		
		SetThread sh = new SetThread(s);
		GetThread gh = new GetThread(s);
		
		Thread shh = new Thread(sh);
		Thread ghh = new Thread(gh);
		
		shh.start();
		ghh.start();
	}

}
