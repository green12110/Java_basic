package cn.itcast_01;
/*
 * 自己做一个枚举类
 * 在Direciton2基础上，加入了抽象方法
 */

public abstract class Direction3 {
	

	public static final Direction3 Foward = new Direction3("前"){
		@Override
		public void show() {
			System.out.println("前");
		}
		
	};
	public static final Direction3 Behind = new Direction3("后"){

		@Override
		public void show() {
			System.out.println("后");
			
		}
		
	};
	public static final Direction3 Left = new Direction3("左"){

		@Override
		public void show() {
			System.out.println("左");
			
		}
		
	};
	public static final Direction3 Right = new Direction3("右"){

		@Override
		public void show() {
			System.out.println("右");
			
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
