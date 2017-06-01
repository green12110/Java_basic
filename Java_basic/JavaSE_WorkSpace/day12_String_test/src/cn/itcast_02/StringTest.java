package cn.itcast_02;
/*
 *  String����жϹ��ܣ�
 * boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
 * boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
 * boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
 * boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
 * 
 */

public class StringTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����ַ�������
				String s1 = "helloworld";
				String s2 = "helloworld";
				String s3 = "HelloWorld";

				// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
				System.out.println("equals:" + s1.equals(s2));   //true
				System.out.println("equals:" + s1.equals(s3));   //false
				System.out.println("-----------------------");

				// boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
				System.out.println("equals:" + s1.equalsIgnoreCase(s2));   //true
				System.out.println("equals:" + s1.equalsIgnoreCase(s3));   //true
				System.out.println("-----------------------");

				// boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
				System.out.println("contains:" + s1.contains("hello"));    //ture
				System.out.println("contains:" + s1.contains("hw"));       //false
				System.out.println("-----------------------");

				// boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
				System.out.println("startsWith:" + s1.startsWith("h"));    //true
				System.out.println("startsWith:" + s1.startsWith("hello"));  //true
				System.out.println("startsWith:" + s1.startsWith("world"));  //false
				System.out.println("-----------------------");

				// ��ϰ��boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β����Լ���
				
				System.out.println("endsWith:" +s1.endsWith("d"));  
				System.out.println("endsWith:"+s1.endsWith("orld"));
				System.out.println("endsWith:" +  s1.endsWith("dfdf"));
				System.out.println("-----------------------");

				// boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
				System.out.println("isEmpty:" + s1.isEmpty());  //false

				String s4 = "";
				String s5 = null;
				System.out.println("isEmpty:" + s4.isEmpty());  //true
				// NullPointerException
				// s5���󶼲����ڣ����Բ��ܵ��÷�������ָ���쳣
				System.out.println("isEmpty:" + s5.isEmpty());

	}

}
