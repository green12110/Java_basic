package cn.itcast_01;

import java.util.Scanner;
/*
 * �ָ��
 *		String���public String[] split(String regex)
 *		���ݸ���������ʽ��ƥ���ִ��ַ����� 
 *
 * ������
 * 		�ٺ��������ͼ�Ե,�䰮��,QQ
 * 		��������
 * 			�Ա�Ů
 * 			��Χ��"18-24"
 * 
 * 		age>=18 && age<=24
 * 
 */

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("�������������");
      int age = sc.nextInt();
      String aa ="18-24";
      //����ָ����
      String regex = "-";
      String[] ageArr = aa.split(regex);
      if(age>=Integer.parseInt(ageArr[0]) && age<=Integer.valueOf(ageArr[1])){
    	  System.out.println("�����������18-24֮��");
    	  
      }else{
    	  System.out.println("���䲻��18-24֮��");
      }
      
	}

}
