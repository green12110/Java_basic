package cn.itcast_02;

import java.util.Scanner;

/*
 * ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * 
 * ����1�����ַ���ת��һ���ַ�����
 *   
 *   2��������������������ͳ�Ƴ��ִ�д�ַ���Сд�ַ��������ַ��ĸ�����
 *     ��ʼ��Ϊ0
 *   3�������ַ�����
 *    �� Charactor ��ķ����ж�   ���ִ�д�ַ���Сд�ַ��������ַ��ĸ���
 *    public static boolean isUpperCase(char ch);
 *    public static boolean isLowercass(char ch);
 *    public static boolean isDigit(char ch);
 *
 */

public class CharacterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int upperCount = 0;
		int lowerCount = 0;
		int numCount = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������ַ�����");
		String ss = sc.nextLine();
		// ���ַ��� ת�� �ַ�����
		char[] chs = ss.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if (Character.isUpperCase(chs[i])) {
				upperCount++;
			}else if(Character.isLowerCase(chs[i])){
				lowerCount++;	
			}else if(Character.isDigit(chs[i])){
                numCount++;				
			}
		}
		
		System.out.println("��д�ַ����ִ�����"+upperCount);
		System.out.println("Сд�ַ����ִ�����"+lowerCount);
		System.out.println("�����ַ����ִ�����"+numCount);

	}

}