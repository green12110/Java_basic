package cn.itcast_07;

import java.util.Scanner;

/*
 * 判断一个字符串是否是对称字符串
 *例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
 *
 *分析：
 *  1、将字符串转化为字符数组  public char[] tocharArray()
 *  2、将字符数字的第一位和最后一位相比
 *            第二次和最后次二位相比
 *            以此类推
 *    共比较 chs.length/2次
 *  3、若全部相等则是对称的
 *     如有一次不等则不是对称的
 */

public class StringBufferTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入字符串：");
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		boolean flag = balance(ss);
		if(flag){
			System.out.println("字符串是对称的");
		}else{
			System.out.println("字符串不是对称的");
		}
		
		boolean flag2 = balance(ss);
		if(flag2){
			System.out.println("字符串是对称的");
		}else{
			System.out.println("字符串不是对称的");
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
	 * 方法2：用StringBuffer的
	 *    1、将字符串Stirng转成StringBuffer
	 *    2、若StringBuffer反转前与反转后内容相同
	 *      就是对称的
	 */
	
	public static boolean balance2(String ss){
		boolean flag = false;
		//用构造方法将String转成StringBuffer
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
	
	//方法二的简易版
	public static boolean balance3(String ss){
		
		return new StringBuffer(ss).reverse().toString().equals(ss);
		
	}

}
