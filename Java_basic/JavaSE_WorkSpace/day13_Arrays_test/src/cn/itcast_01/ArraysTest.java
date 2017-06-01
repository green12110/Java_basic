package cn.itcast_01;

import java.util.Arrays;

/*
 * Arrays 针对数组进行操作的工具
 *        提供排序，查找等功能
 * 1、public static String toString(int[] a)
 *   将数组转成字符串
 * 2、public static void sort(int[] a)
 *   排序
 * 3、public static int binarySearch(int[] a,int key)
 *   二分法查找
 */

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 12, 34, 56, 78, 90 };
		int[] b = { 45, 12, 56, 0, 7, 90, 34 };
		// System.out.println(a.toString());
		// 数组转字符串
		String aa = Arrays.toString(a);
		if (aa instanceof String) {
			System.out.println("字符串：" + aa);
		} else {
			System.out.println("这不是个字符串");
		}

		// 排序
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		// 二分查找
		int result = Arrays.binarySearch(a, 78);
		System.out.println("查找字符串a中78的索引位置：" + result);
		int result2 = Arrays.binarySearch(a, 20);
		System.out.println("查找a中20的索引位置：" + result2);

	}

}
