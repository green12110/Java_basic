package cn.itcast_07;

import java.util.Scanner;

/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 *����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 *
 *������
 *  1�����ַ���ת��Ϊ�ַ�����  public char[] tocharArray()
 *  2�����ַ����ֵĵ�һλ�����һλ���
 *            �ڶ��κ����ζ�λ���
 *            �Դ�����
 *    ���Ƚ� chs.length/2��
 *  3����ȫ��������ǶԳƵ�
 *     ����һ�β������ǶԳƵ�
 */

public class StringBufferTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ַ�����");
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		boolean flag = balance(ss);
		if(flag){
			System.out.println("�ַ����ǶԳƵ�");
		}else{
			System.out.println("�ַ������ǶԳƵ�");
		}
		
		boolean flag2 = balance(ss);
		if(flag2){
			System.out.println("�ַ����ǶԳƵ�");
		}else{
			System.out.println("�ַ������ǶԳƵ�");
		}

	}

	public static boolean balance(String ss) {
		boolean flag = false;
		char[] chs = ss.toCharArray();
		for (int i = 0, j = chs.length - 1; i < chs.length / 2; i++, j--) {
			if (chs[i] == chs[j]) {
                flag = true;
			} else {
                flag = false;
                break;
			}

		}
		return flag;
	}
	
	/*
	 * ����2����StringBuffer��
	 *    1�����ַ���Stirngת��StringBuffer
	 *    2����StringBuffer��תǰ�뷴ת��������ͬ
	 *      ���ǶԳƵ�
	 */
	
	public static boolean balance2(String ss){
		boolean flag = false;
		//�ù��췽����Stringת��StringBuffer
		StringBuffer sb = new StringBuffer(ss);
		String s1 = sb.toString();
		String s2 = sb.reverse().toString();
		if(s1.equals(s2)){
			flag = true;
		}else{
			flag = false;
		}
		return flag;
		
	}
	
	//�������ļ��װ�
	public static boolean balance3(String ss){
		
		return new StringBuffer(ss).reverse().toString().equals(ss);
		
	}

}
