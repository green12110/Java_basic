package cn.itcast_02;

/*
 * public static boolean isUpperCase(char ch)
 * public static boolean isLowerCase(char ch)
 * public static boolean isDigit(char ch)
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 */

public class CharacterDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character ch1 = 'a';
		Character ch2 = 'A';

		// 判断给出的字符是否是大写字符
		System.out.println("isUpperCase:" + Character.isUpperCase('A'));
		System.out.println("isUpperCase:" + Character.isUpperCase('a'));
		System.out.println("isUpperCase:" + Character.isUpperCase('0'));
		System.out.println("------------------");

		// 判断给出的字符是否是小写字符
		System.out.println("isLowerCase:"+Character.isLowerCase('A'));
		System.out.println("isLowerCase:"+Character.isLowerCase('a'));
		System.out.println("isLowerCase:"+Character.isLowerCase('0'));
		System.out.println("------------------");
		
		//判断给出的字符是否是数字
		System.out.println("isDigit:"+Character.isDigit('1'));
		System.out.println("isDigit:"+Character.isDigit('d'));
		System.out.println("isDigit:"+Character.isDigit('0'));
		System.out.println("------------------");
		
		//经给定的字符转成大写
		System.out.println("toUpperCase:"+Character.toUpperCase('A'));
		System.out.println("toUpperCase:"+Character.toUpperCase('a'));
		System.out.println("toUpperCase:"+Character.toUpperCase('0'));
	
		
		
	}

}
