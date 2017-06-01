package cn.itcast_07;

import java.util.Scanner;

/*
 * 字符串反转
 *  举例：键盘录入”abc”		输出结果：”cba”
 *  1、将录入的字符变成StringBuffer类型
 *  2、用StringBuffer的  public StringBuffer reverse()方法反转
 *  3、将StringBuffer转成String
 */
public class StringBufferTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String ss = sc.nextLine();
		System.out.println("反转："+reverse(ss));

	}
	
	public static String reverse(String ss){
		/*StringBuffer sb = new StringBuffer();
		sb.append(ss).reverse();*/
		return new StringBuffer(ss).reverse().toString();
	}

}
