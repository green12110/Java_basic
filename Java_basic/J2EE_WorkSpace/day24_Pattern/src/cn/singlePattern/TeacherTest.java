package cn.singlePattern;
/**
 * ����ģʽ��
 * 1������ʽ--����ʹ��--��������
 * 2������ʽ���ӳټ��أ�--����ʹ��--�̰߳�ȫ����
 * 
 * �̰߳�ȫ����
 * 		a:�Ƿ���̻߳���	��
 * 		b:�Ƿ��й�������	��
 * 		c:�Ƿ��ж����������������� 	��
 * 
 * 
 * @author Administrator
 *
 */
public class TeacherTest {
	
	public static void main(String[] args) {
		Teacher t1 = Teacher.getTeacher();
		Teacher t2 = Teacher.getTeacher();
		System.out.println(t1==t2);
		
	}

}
