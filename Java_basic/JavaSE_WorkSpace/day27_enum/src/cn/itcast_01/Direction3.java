package cn.itcast_01;
/*
 * �Լ���һ��ö����
 * ��Direciton2�����ϣ������˳��󷽷�
 */

public abstract class Direction3 {
	

	public static final Direction3 Foward = new Direction3("ǰ"){
		@Override
		public void show() {
			System.out.println("ǰ");
		}
		
	};
	public static final Direction3 Behind = new Direction3("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	};
	public static final Direction3 Left = new Direction3("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	};
	public static final Direction3 Right = new Direction3("��"){

		@Override
		public void show() {
			System.out.println("��");
			
		}
		
	};
	
	/*private Direction(){
		
	}*/
	
	private String name;
	
	private Direction3(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void show();
	

}
