package cn.itcast_01;
/*
 * �滻����
 *  	String���public String replaceAll(String regex,String replacement)
 *  	ʹ�ø����� replacement �滻���ַ�������ƥ�������������ʽ�����ַ����� 
 *      ���������ַ�
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss="Hello8975475World3454Java457";
		String ss1 = ss.replaceAll("[0-9]", "*");
		String ss2 = ss.replaceAll("\\d+", "*");
		String ss3 = ss.replaceAll("\\d+", "");
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);

	}

}
