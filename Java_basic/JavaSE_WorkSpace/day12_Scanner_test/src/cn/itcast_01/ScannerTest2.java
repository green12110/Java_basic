package cn.itcast_01;

import java.util.Scanner;
/*
 *  public int nextInt();
 *  public String nextLine();
 ���������ˣ�
 * 		�Ȼ�ȡһ����ֵ���ڻ�ȡһ���ַ�������������⡣
 * 		��Ҫԭ�򣺾����Ǹ����з��ŵ����⡣
 * ��ν����?
 * 		A:�Ȼ�ȡһ����ֵ���ڴ���һ���µļ���¼������ȡ�ַ�����
 * 		B:�����е����ݶ��Ȱ����ַ�����ȡ��Ȼ��Ҫʲô����Ͷ�Ӧ��ת��Ϊʲô��
 * */

public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int x = sc.nextInt();
		System.out.println("�������ַ���");
		Scanner sc2 = new Scanner(System.in);
		String ss = sc2.nextLine();
		System.out.println("x:"+x+",s:"+ss);
		
	}

}
