package cn.itcast_01;

import java.util.Arrays;

/*
 * Arrays ���������в����Ĺ���
 *        �ṩ���򣬲��ҵȹ���
 * 1��public static String toString(int[] a)
 *   ������ת���ַ���
 * 2��public static void sort(int[] a)
 *   ����
 * 3��public static int binarySearch(int[] a,int key)
 *   ���ַ�����
 */

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 12, 34, 56, 78, 90 };
		int[] b = { 45, 12, 56, 0, 7, 90, 34 };
		// System.out.println(a.toString());
		// ����ת�ַ���
		String aa = Arrays.toString(a);
		if (aa instanceof String) {
			System.out.println("�ַ�����" + aa);
		} else {
			System.out.println("�ⲻ�Ǹ��ַ���");
		}

		// ����
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));

		// ���ֲ���
		int result = Arrays.binarySearch(a, 78);
		System.out.println("�����ַ���a��78������λ�ã�" + result);
		int result2 = Arrays.binarySearch(a, 20);
		System.out.println("����a��20������λ�ã�" + result2);

	}

}
