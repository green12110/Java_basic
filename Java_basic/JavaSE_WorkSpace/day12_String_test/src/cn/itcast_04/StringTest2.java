package cn.itcast_04;

import java.util.Scanner;
/*
 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：
 * 		"Hello123World"
 * 结果：
 * 		大写字符：2个
 * 		小写字符：8个
 * 		数字字符：3个
 * 
 * 分析，要想判断字符串中大写字母字符，小写字母字符，数字字符出现的次数
 *    先把字符串的每个字符都取出来
 *    char charAt（int index）
 *    然后对应ansi值判断
 */

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s = sc.nextLine();*/
		String s= "Hello123World";
		int daxie = 0;
		int xiaoxie = 0;
		int num = 0;
		for(int i=0;i<s.length();i++){
			char a = s.charAt(i);
			if(a>='A' && a<='Z'){
				daxie++;
			}else if(a>='a' && a<='z'){
				xiaoxie++;
			}else if(a>='0' && a<='9'){
				num++;
			}
			
		}
		
		System.out.println("大写字符："+daxie+"个");
		System.out.println("小写字符："+xiaoxie+"个");
		System.out.println("数字："+num+"个");

	}

}
