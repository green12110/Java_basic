package cn.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *		
 *		模式和匹配器的基本使用顺序
 */

public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		System.out.println(b);
		System.out.println("----------------");
		
		//方法二：
		String str ="aaaaab";
		boolean b2 = str.matches("a*b");
		System.out.println(b2);

	}

}
