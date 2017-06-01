package cn.itcast_07;
/*
 * StringBuffer
 * 线程安全的可变字符序列。
 * 
 * 构造方法
 * 1、public StringBuffer()  
 *   构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
 * 2、public StringBuffer(int capacity) 
              构造一个具有指定初始容量的字符串缓冲区。
   3、public StringBuffer(String str) 
               构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容

 * 
 * */

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1:"+sb1);
        System.out.println(sb1.length());   //0
        System.out.println(sb1.capacity());  //16
        System.out.println("-----------");
        
        StringBuffer sb2 = new StringBuffer(20);
        System.out.println("sb2:"+sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        System.out.println("-----------");
        
        StringBuffer sb3 = new StringBuffer("gewen");
        System.out.println("sb3:"+sb3);
        System.out.println(sb3.length()); //5
        System.out.println(sb3.capacity());//21
      
        

	}

}
