package cn.itcast_07;

import java.util.Scanner;

/*
 * �ַ�����ת
 *  ����������¼�롱abc��		����������cba��
 *  1����¼����ַ����StringBuffer����
 *  2����StringBuffer��  public StringBuffer reverse()������ת
 *  3����StringBufferת��String
 */
public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String ss = sc.nextLine();
		System.out.println("��ת��"+reverse(ss));

	}
	
	public static String reverse(String ss){
		/*StringBuffer sb = new StringBuffer();
		sb.append(ss).reverse();*/
		return new StringBuffer(ss).reverse().toString();
	}

}
