package cn.itcast_02;

public class FunctionTest {
	public static void main(String[] args) {
		Direction2 d21 = Direction2.FRONT;
		Direction2 d22 = Direction2.BEHIND;
		Direction2 d23 = Direction2.LEFT;
		Direction2 d24 = Direction2.RIGHT;
		// int compareTo(E o)
		System.out.println(d21.compareTo(d22));
		System.out.println(d22.compareTo(d22));
		System.out.println(d23.compareTo(d22));
		System.out.println("--------------------");
		Direction3 d31 = Direction3.FRONT;
		// String name()
		System.out.println(d21.name());
		System.out.println(d31.name());
		System.out.println("--------------------");
		// int ordinal()
		System.out.println(d21.ordinal());
		System.out.println(d22.ordinal());
		System.out.println(d23.ordinal());
		System.out.println(d24.ordinal());
		System.out.println("--------------------");
		// <T> T valueOf(Class<T> type,String name)
		Direction2 d = Enum.valueOf(Direction2.class, "FRONT");
		System.out.println(d.getName());
		System.out.println("----------------");
		
		Direction2[] vs = Direction2.values();
		for(Direction2 v: vs){
			System.out.println(v);
		}
	}

}
