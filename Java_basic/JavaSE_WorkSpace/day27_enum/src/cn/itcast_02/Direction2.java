package cn.itcast_02;

public enum Direction2 {
	FRONT("Ç°"),BEHIND("ºó"),LEFT("×ó"),RIGHT("ÓÒ");
	
	private String name;
	
	private Direction2(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}

}
