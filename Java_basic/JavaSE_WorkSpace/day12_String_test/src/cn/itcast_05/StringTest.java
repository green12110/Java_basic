package cn.itcast_05;
/*
 * ���󣺰�һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
 * ������
 * 		helloWORLD
 * �����
 * 		Helloworld
 * 
 * ������
 * 		A:�Ȼ�ȡ��һ���ַ�
 * 		B:��ȡ���˵�һ���ַ�������ַ�
 * 		C:��Aת�ɴ�д
 * 		D:��Bת��Сд
 * 		E:Cƴ��D
 */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s ="HelloWORLD";
       
       String s1 =s.substring(0, 1);
       String s2 =s.substring(1);
       String das = s1.toUpperCase();
       String xiaos = s2.toLowerCase();
       String ss = das.concat(xiaos);
       System.out.println(ss);
       
       //�Ż�����
       String ss2 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
       System.out.println(ss2);
	}

}
