package cn.singlePattern;

public class Teacher {
	
	private Teacher(){
		
		
	}
	
	private static Teacher th = null;
	
	public synchronized static Teacher getTeacher(){
		if(th == null){
			th = new Teacher();
		}
		return th;
	}

}
