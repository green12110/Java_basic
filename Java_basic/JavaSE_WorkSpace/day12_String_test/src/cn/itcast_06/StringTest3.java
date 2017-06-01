package cn.itcast_06;

import java.util.Scanner;

/*
 * 字符串反转
 举例：键盘录入”abc”		输出结果：”cba”
 分析：1、有键盘录入字符串
 2、将获取的字符串转换为字符数组
 3、倒序，将第i位换成第length-1-i
 4、将新字符数组转成字符串
 5、输出新字符串
 */

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String s1 = sc.nextLine();

		System.out.println("倒序输出：" + reverse(s1));
		System.out.println("倒序输出：" + reverse2(s1));
	}

	public static String reverse(String s1) {

		// 将字符串转换成字符数组
		char[] a = s1.toCharArray();
		for (int i = 0, j = a.length - 1; i < a.length / 2; i++, j--) {
			char temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		// 将字符数组转为字符串
		String s2 = String.valueOf(a);
		return s2;

	}

	public static String reverse2(String s1) {
		char[] chs = s1.toCharArray();
		String ss = "";
		for (int i = chs.length-1; i >=0; i--) {
           ss+=chs[i];
		}
		return ss;

	}

}
