package cn.itcast_01;

import java.util.Arrays;
/*
 * ��������һ���ַ���:��91 27 46 38 50��
 * ��д����ʵ�������������ǣ���27 38 46 50 91��
 * 
 * ����
 * 1���Ƚ�ԭ�ַ�������������ʽ�ָ�
 * 2����ȡ�ַ�������
 * 3�������ֽ�������
 * 3������˳��ƴ��
 *    ����StringBuilder ƴ��
 * 
 */

public class RegexTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1= "91 27 46 38 50";
       //������ʽ�ָ��
       String[] strArr = s1.split(" ");
       
       for(int i=0;i<strArr.length;i++){
    	   System.out.println(strArr[i]);
       }
       
       Arrays.sort(strArr);
       
       StringBuilder sb = new StringBuilder();
       for(int i=0;i<strArr.length;i++){
    	  sb.append(strArr[i]).append(" ");
       }
       
       System.out.println(sb.toString().trim());
       
       
	}

}
