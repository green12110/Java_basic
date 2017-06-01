package cn.System;

import java.util.Arrays;

/*
 * System类包含一些有用的类字段和方法。它不能被实例化。 
 * 
 * 方法：
 * 		public static void gc()：运行垃圾回收器。 
 *		public static void exit(int status):终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止。 
 *		public static long currentTimeMillis():返回以毫秒为单位的当前时间
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义数组
				int[] arr = { 11, 22, 33, 44, 55 };
				int[] arr2 = { 6, 7, 8, 9, 10 };

				// 请大家看这个代码的意思
				System.arraycopy(arr, 1, arr2, 2, 2); //  6, 7, 22, 33, 10

				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(arr2));
	}

}
