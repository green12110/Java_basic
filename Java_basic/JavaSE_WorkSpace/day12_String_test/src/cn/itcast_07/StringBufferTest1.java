package cn.itcast_07;
/*
 * String��StringBuffer���໥ת��
 */

public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String ss="HelloWorld";
       /*
        * Stringת��StringBuffer
        * ���ַ���1��ͨ��StringBuffer�Ĺ��췽��
        *      2��ͨ��append()����
        */
       //����һ
       StringBuffer sb = new StringBuffer(ss);
       //������
       StringBuffer sb2 = new StringBuffer();
       sb2.append("java");
       
       System.out.println("sb:"+sb);
       System.out.println("sb2:"+sb2);
  
       /*
        * StringBuffer תString
        * ���ַ���1��ͨ�����캯��
        *      2��ͨ��SringBuffer��String����
        */
      String ss1 = new String(sb);
      System.out.println("ss1:"+ss1);
      String ss2 = sb.toString();
      System.out.println("ss2:"+ss2);
	}

}
