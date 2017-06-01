package cn.itcast_05;

import java.net.StandardSocketOptions;

/*
 * String��ת�����ܣ�
 * byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
 * char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
 * static String valueOf(char[] chs):���ַ�����ת���ַ�����
 * static String valueOf(int i):��int���͵�����ת���ַ�����
 * 		ע�⣺String���valueOf�������԰��������͵�����ת���ַ�����
 * String toLowerCase():���ַ���ת��Сд��
 * String toUpperCase():���ַ���ת�ɴ�д��
 * String concat(String str):���ַ���ƴ�ӡ�
 */
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello123World";
		
		// byte[] getBytes()
		byte[] b = s.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("\n--------------------");
		
		//char[] toCharArray()
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+ " ");
		}
		System.out.println("\n--------------------");
		
		//static String valueOf(char[] chs)
		String ss1 = String.valueOf(ch);
		System.out.println(ss1);
		System.out.println("--------------------");
		
		//static String valueOf(int i)
		System.out.println(String.valueOf(1100));
		System.out.println(String.valueOf(12.56F));
		System.out.println("--------------------");
		
		//String toLowerCase()
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println("--------------------");
		
		System.out.println(s.concat("456"));
	}

}
