package cn.itcast_04;

import java.util.Scanner;

/*
 * 需求：遍历获取字符串中的每一个字符
 * 如何获取每一个字符？
 * char charAt（int index）
 */

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s = sc.nextLine();
		
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}
		

	}

}
