package cn.itcast_02;

public class DirectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d = Direction.LEFT;
		//Direction �̳��� Enum�࣬��д��toString��������
		System.out.println(d);  //LEFT
		System.out.println("-----------");
		
		Direction2 d2 = Direction2.FRONT;
		System.out.println(d2);
		System.out.println(d2.getName());
		System.out.println("--------------");
		
		Direction3 d3 = Direction3.RIGHT;
		System.out.println(d3);
		System.out.println(d3.getName());
		d3.show();
		

	}

}
