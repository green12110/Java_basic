package cn.itcast_01;
/*
 * �Լ���һ��ö����
 * ��֮ǰ�����ϣ����ϳ�Ա��������Ա���������ι��췽������Ҫ�޲εģ�
 */

public class Direction2 {
	
	public static final Direction2 Foward = new Direction2("ǰ");
	public static final Direction2 Behind = new Direction2("��");
	public static final Direction2 Left = new Direction2("��");
	public static final Direction2 Right = new Direction2("��");
	
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
