package cn.itcast_02;

public enum Direction3 {
	FRONT("ǰ"){
		public void show(){
			System.out.println("ǰ");
		}
	},
	BEHIND("��"){
		public void show(){
			System.out.println("��");
		}
		
	},
	LEFT("��"){
		public void show(){
			System.out.println("��");
		}
	},RIGHT("��"){
		public void show(){
			System.out.println("��");
		}
	};
	
	private String name;
	
	private Direction3(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}
	
	public abstract void show();

}
