package cn.itcast_06;

import java.util.Scanner;

/*
 * �ַ�����ת
 ����������¼�롱abc��		����������cba��
 ������1���м���¼���ַ���
 2������ȡ���ַ���ת��Ϊ�ַ�����
 3�����򣬽���iλ���ɵ�length-1-i
 4�������ַ�����ת���ַ���
 5��������ַ���
 */

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String s1 = sc.nextLine();

		System.out.println("���������" + reverse(s1));
		System.out.println("���������" + reverse2(s1));
	}

	public static String reverse(String s1) {

		// ���ַ���ת�����ַ�����
		char[] a = s1.toCharArray();
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		// ���ַ�����תΪ�ַ���
		String s2 = String.valueOf(a);
		return s2;

	}

	public static String reverse2(String s1) {
		char[] chs = s1.toCharArray();
		String ss = "";
		for (int i = chs.length-1; i >=0; i--) {
           ss+=chs[i];
		}
		return ss;

	}

}
