package cn.itcast_02;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 
 * 分析1、将字符串转成一个字符数组
 *   
 *   2、定义三个变量，用于统计出现大写字符、小写字符、数字字符的个数，
 *     初始化为0
 *   3、遍历字符数组
 *    用 Charactor 类的方法判断   出现大写字符、小写字符、数字字符的个数
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
		System.out.print("请输入字符串：");
		String ss = sc.nextLine();
		// 将字符串 转成 字符数组
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
		
		System.out.println("大写字符出现次数："+upperCount);
		System.out.println("小写字符出现次数："+lowerCount);
		System.out.println("数字字符出现次数："+numCount);

	}

}
