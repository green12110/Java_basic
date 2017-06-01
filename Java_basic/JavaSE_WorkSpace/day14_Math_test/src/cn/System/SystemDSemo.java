package cn.System;
/*
 * System类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法：
 * 		public static void gc()：运行垃圾回收器。 
 *		public static void exit(int status):终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。 
 *		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDSemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("我喜欢网易");
		//System.exit(0);
		System.out.println("我也喜欢腾讯新闻");
		System.out.println(System.currentTimeMillis());
		//用于计算运行一段程序的时间（多少毫秒）
		long start = System.currentTimeMillis();
		for(int i=1;i<=1000;i++){
			System.out.println("输出第"+i+"个\tHello");
		}
		long end = System.currentTimeMillis();
		System.out.println("------------");
		System.out.println(end-start);

	}

}
