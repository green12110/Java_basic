package cn.itcast_04;

import java.util.Scanner;

/*
 * ���󣺱�����ȡ�ַ����е�ÿһ���ַ�
 * ��λ�ȡÿһ���ַ���
 * char charAt��int index��
 */

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		

	}

}
