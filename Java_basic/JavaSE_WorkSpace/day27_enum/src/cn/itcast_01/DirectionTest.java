package cn.itcast_01;

public class DirectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Direction d = Direction.Foward;
		System.out.println(d);  //cn.itcast_01.Direction@1db9742
		System.out.println("---------------------");
		
		Direction2 d2 = Direction2.Behind;
		System.out.println(d2);//cn.itcast_01.Direction2@106d69c
		System.out.println(d2.getName());
		System.out.println("---------------------");
		
		
		Direction3 d3 = Direction3.Left;
		System.out.println(d3);  //cn.itcast_01.Direction3$3@52e922
		System.out.println(d3.getName());
		d3.show();
		

	}

}
