package cn.reflect_arr;
/**
 * 1、具有相同维护和数组元素的数组属于同一种类型，即具有相同的Class实例的对象
 * @author Administrator
 *
 */

public class ArrTest {
	
	public static void main(String[] args) {
		
		int[] a1 = new int[3];
		int[] a2 = new int[4];
		String[] a3 = new String[5];
		int[][] a4 = new int[3][4];
		System.out.println(a1.getClass() == a2.getClass());  //true
		//System.out.println(a1.getClass() == a4.getClass());
		System.out.println(a1.getClass().getName());  // [I
		System.out.println(a3.getClass().getName());  // [l java.lang.String
		System.out.println(a4.getClass().getName());  // [[I
		System.out.println(a1.getClass().getSuperclass().getName());
		
		Object obj1 = a1;
		System.out.println(obj1);
		Object obj2 = a3;
		System.out.println(obj2);
		Object[] obj3 = a3;
		System.out.println(obj3);
	
		
	}

}
