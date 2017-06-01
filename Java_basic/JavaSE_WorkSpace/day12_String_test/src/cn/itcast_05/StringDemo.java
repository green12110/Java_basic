package cn.itcast_05;

import java.net.StandardSocketOptions;

/*
 * String的转换功能：
 * byte[] getBytes():把字符串转换为字节数组。
 * char[] toCharArray():把字符串转换为字符数组。
 * static String valueOf(char[] chs):把字符数组转成字符串。
 * static String valueOf(int i):把int类型的数据转成字符串。
 * 		注意：String类的valueOf方法可以把任意类型的数据转成字符串。
 * String toLowerCase():把字符串转成小写。
 * String toUpperCase():把字符串转成大写。
 * String concat(String str):把字符串拼接。
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
