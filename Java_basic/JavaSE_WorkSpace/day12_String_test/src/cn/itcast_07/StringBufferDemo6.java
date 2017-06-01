package cn.itcast_07;
/*
 * StringBuffer ½ØÈ¡¹¦ÄÜ
 * public String substring(int start)
 * public String substring(int start,int end)
 */

public class StringBufferDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("HelloWorldjava");
		System.out.println(sb);
		String s1 = sb.substring(10);
		String s2 = sb.substring(0,5);
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
