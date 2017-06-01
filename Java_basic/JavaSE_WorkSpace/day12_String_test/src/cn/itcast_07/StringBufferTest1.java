package cn.itcast_07;
/*
 * String和StringBuffer的相互转换
 */

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ss="HelloWorld";
       /*
        * String转成StringBuffer
        * 两种方法1、通过StringBuffer的构造方法
        *      2、通过append()方法
        */
       //方法一
       StringBuffer sb = new StringBuffer(ss);
       //方法二
       StringBuffer sb2 = new StringBuffer();
       sb2.append("java");
       
       System.out.println("sb:"+sb);
       System.out.println("sb2:"+sb2);
  
       /*
        * StringBuffer 转String
        * 两种方法1、通过构造函数
        *      2、通过SringBuffer的String方法
        */
      String ss1 = new String(sb);
      System.out.println("ss1:"+ss1);
      String ss2 = sb.toString();
      System.out.println("ss2:"+ss2);
	}

}
