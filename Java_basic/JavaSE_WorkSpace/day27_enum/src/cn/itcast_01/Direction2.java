package cn.itcast_01;
/*
 * 自己做一个枚举类
 * 在之前基础上，加上成员变量，成员方法，带参构造方法（不要无参的）
 */

public class Direction2 {
	
	public static final Direction2 Foward = new Direction2("前");
	public static final Direction2 Behind = new Direction2("后");
	public static final Direction2 Left = new Direction2("左");
	public static final Direction2 Right = new Direction2("右");
	
	/*private Direction(){
		
	}*/
	
	private String name;
	
	private Direction2(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	

}
