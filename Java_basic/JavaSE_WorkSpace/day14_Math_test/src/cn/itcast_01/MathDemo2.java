package cn.itcast_01;

import java.util.Scanner;

/*
 * ���������һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������
 * 
 * ������
 * 		A:����¼���������ݡ�
 * 			int strat;
 * 			int end;
 * 		B:��취��ȡ��start��end֮��������
 * 			��дһ������ʵ�����Ч�����õ�һ���������(int)
 * 		C:�����������
 */

public class MathDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ�����֣�");
		int start = sc.nextInt();
		System.out.println("��������������֣�");
		int end = sc.nextInt();
		// ���÷���
		for (int i = 0; i < 100; i++) {
			int num = getRondom(start, end);
			System.out.println(num);
		}
	}

	public static int getRondom(int start, int end) {
		// ����1-100�������
		// int num = (int)(Math.random()*100)+1;
		// int num = (int)(Math.random()*end)+start;
		int num1 = (int) (Math.random() * (end - start + 1)) + start;
		return num1;

	}

}
