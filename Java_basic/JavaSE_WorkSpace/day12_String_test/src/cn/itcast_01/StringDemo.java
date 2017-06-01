package cn.itcast_01;
/*
 * String
 * 构造方法：
 * public String()
   public String(byte[] bytes)
   public String(byte[] bytes,int offset,int length)
   public String(char[] value)
   public String(char[] value,int offset,int count)
   public String(String original
 */

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String();
		System.out.println("字符串s1:"+s1);
		System.out.println("长度：" +s1.length());
		System.out.println("---------------------");
		
		byte[] by = {97,98,99,100,120};
		String s2 = new String(by);
		System.out.println(s2);
		System.out.println("字符串s2:"+s2);
		System.out.println("长度：" +s2.length());
		System.out.println("---------------------");
		
		String s3 = new String(by,1,2);
		System.out.println("字符串s3:"+s3);
		System.out.println("长度：" +s3.length());
		System.out.println("---------------------");
		
		char[] c = {'a','b','c','d','e'};
		String s4 = new String(c);
		System.out.println("字符串s4:"+s4);
		System.out.println("长度：" +s4.length());
		System.out.println("---------------------");
		
		String s5 = new String(c,1,2);
		System.out.println("字符串s5:"+s5);
		System.out.println("长度：" +s5.length());
		System.out.println("---------------------");
		
		String s6 = new String("Hello");
		System.out.println("字符串s6:"+s6);
		System.out.println("长度:"+s6 .length());
		System.out.println("---------------------");
		
		String s7 = "Hello";
		System.out.println("字符串s7:"+s6);
		System.out.println("长度:"+s7.length());
	}

}
