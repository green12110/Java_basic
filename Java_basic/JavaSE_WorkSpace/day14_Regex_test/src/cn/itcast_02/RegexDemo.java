package cn.itcast_02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��ȡ����
 *		Pattern��Matcher���ʹ��
 *		
 *		ģʽ��ƥ�����Ļ���ʹ��˳��
 */

public class RegexDemo {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a*b");
		Matcher m = p.matcher("aaaaab");
		boolean b = m.matches();
		System.out.println(b);
		System.out.println("----------------");
		
		//��������
		String str ="aaaaab";
		boolean b2 = str.matches("a*b");
		System.out.println(b2);

	}

}
