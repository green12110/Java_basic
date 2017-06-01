package cn.itcast_01;

/*
 * Math:用于数学运算的类。
 * 成员变量：
 * 		public static final double PI
 * 		public static final double E
 * 成员方法：
 * 		public static int abs(int a)：绝对值
 *		public static double ceil(double a):向上取整
 *		public static double floor(double a):向下取整
 *		public static int max(int a,int b):最大值 (min自学)
 *		public static double pow(double a,double b):a的b次幂
 *		public static double random():随机数 [0.0,1.0)
 *		public static int round(float a) 四舍五入(参数为double的自学)
 *		public static double sqrt(double a):正平方根
 */

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PI:"+Math.PI);
		System.out.println("PI:"+Math.E);
		System.out.println("-----------------");
		
		System.out.println("abs:" + Math.abs(-5));
		System.out.println("abs:" + Math.abs(-5.9));
		System.out.println("-----------------");

		// 向上取整
		System.out.println("ceil:" + Math.ceil(5.1));
		System.out.println("ceil:" + Math.ceil(-5.1));
		System.out.println("-----------------");

		// 向上取整
		System.out.println("floor:" + Math.floor(5.9));
		System.out.println("floor:" + Math.floor(-5.1));
		System.out.println("-----------------");

		// 最大值
		System.out.println("max:" + Math.max(6, 3.2));
		// 最小值
		System.out.println("min:" + Math.min(6, 3.2));
		System.out.println("-----------------");

		// a的b次幂
		System.out.println("pow:" + Math.pow(2, 4));
		System.out.println("pow:" + Math.pow(2.1, 4));
		System.out.println("-----------------");

		// 随机数,都是[0.0,1.0]范围内
		for (int i = 1; i <=10; i++) {
			System.out.println("random\t第"+i+"个数："+ Math.random());
		}
		// 获取一个1-100之间的随机数
		System.out.println("random[1,100]："+ ((int)(Math.random()*100)+1));
		System.out.println("-----------------");
		
		//四舍五入
		System.out.println("round:"+Math.round(4.5));
		System.out.println("round:"+Math.round(4.0001));
		System.out.println("-----------------");
		
		//正平方根
		System.out.println("sqrt:"+Math.sqrt(5.7));
		System.out.println("sqrt:"+Math.sqrt(4));

	}

}
