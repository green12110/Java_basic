package cn.reflect_01;
/*
* ���䣺����ͨ��class�ļ�����ȥʹ�ø��ļ��еĳ�Ա���������췽������Ա������
* 
* Person p = new Person();
* p.ʹ��
* 
* Ҫ������ʹ�ã����������õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���
* Class�ࣺ
* 		��Ա����	Field
* 		���췽��	Constructor
* 		��Ա����	Method
* 
* ��ȡclass�ļ�����ķ�ʽ��
* A:Object���getClass()����
* B:�������͵ľ�̬����class
* C:Class���еľ�̬����
* 		public static Class forName(String className)
* 
* һ�����ǵ���ʹ��˭��?
* 		A:�Լ���	��ѡһ�֣��ڶ��ֱȽϷ���
* 		B:����	������
* 			Ϊʲô��?��Ϊ��������һ���ַ�����������һ��������������������ǾͿ��԰��������ַ������õ������ļ��С�
*/

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Object���getClass()����
		Person per = new Person();
		System.out.println(per.getClass());
		
		//�������͵ľ�̬����class
		Class c = Integer.class;
		System.out.println(c);
		Class pc = Person.class;
		System.out.println(pc);
		
		//Class���еľ�̬����
		System.out.println(Class.forName("cn.reflect_01.Person"));
		
		//isPrimitive()�Ƿ���ԭʼ����
		System.out.println(pc.isPrimitive());
		System.out.println(String.class.isPrimitive());  //false
		System.out.println(int.class.isPrimitive());     //true
		//Integer.TYPE �õ����������ֽ���
		System.out.println(int.class == Integer.TYPE);  //true
		//�ж����������Ƿ��ǻ��������ֽ���
		System.out.println(int[].class.isPrimitive());  //false
		//isArray()�Ƿ������������ֽ���
		System.out.println(int[].class.isArray());   //true
	}

}
