package cn.singlePattern;
/**
 * ����ģʽ����֤�����ڴ���ֻ��һ������
 * 
 * ���ʵ�֣�
 * 1���ѹ��췽��˽�У����ܴ�������
 * 2���ڳ�Աλ�ô���һ������
 * 3�������ͨ�ţ�ͨ��һ����������
 *
 */
public class Student {
	
	private Student(){
		
    }
	
	private static Student stu = new Student();
	
	public static Student getStudent(){
		return stu;
	}
	
	
	

}
