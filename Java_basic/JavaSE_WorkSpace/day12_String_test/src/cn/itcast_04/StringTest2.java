package cn.itcast_04;

import java.util.Scanner;
/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������
 * 		"Hello123World"
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 * 
 * ������Ҫ���ж��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���
 *    �Ȱ��ַ�����ÿ���ַ���ȡ����
 *    char charAt��int index��
 *    Ȼ���Ӧansiֵ�ж�
 */

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���");
		String s = sc.nextLine();*/
		String s= "Hello123World";
		int daxie = 0;
		int xiaoxie = 0;
		int num = 0;
		for(int i=0;i<s.length();i++){
			char a = s.charAt(i);
			if(a>='A' && a<='Z'){
				daxie++;
			}else if(a>='a' && a<='z'){
				xiaoxie++;
			}else if(a>='0' && a<='9'){
				num++;
			}
			
		}
		
		System.out.println("��д�ַ���"+daxie+"��");
		System.out.println("Сд�ַ���"+xiaoxie+"��");
		System.out.println("���֣�"+num+"��");

	}

}
