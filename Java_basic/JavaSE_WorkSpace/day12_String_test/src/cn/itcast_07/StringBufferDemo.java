package cn.itcast_07;
/*
 * StringBuffer
 * �̰߳�ȫ�Ŀɱ��ַ����С�
 * 
 * ���췽��
 * 1��public StringBuffer()  
 *   ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
 * 2��public StringBuffer(int capacity) 
              ����һ������ָ����ʼ�������ַ�����������
   3��public StringBuffer(String str) 
               ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ�������

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
