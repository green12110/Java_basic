package cn.itcast_01;
/*
 * ����5��ѧ����������5��ѧ������Ϣ�洢�������У����������飬��ȡ�õ�ÿһ��ѧ����Ϣ��
 *		 ѧ����Student
 *		 ��Ա������name,age
 *		 ���췽�����޲�,����
 *		 ��Ա������getXxx()/setXxx()
 *		 �洢ѧ��������?�Լ�����Ӧ����ʲô���ӵ�?
 * ������
 * 		A:����ѧ���ࡣ
 * 		B:����ѧ������(��������)��
 * 		C:����5��ѧ�����󣬲���ֵ��
 * 		D:��C�����Ԫ�أ��ŵ������С�
 * 		E:����ѧ�����顣
 */

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[5];
		
		stu[0] = new Student("Jack",18);
		stu[1] = new Student("merry",23);
		stu[2] = new Student("robert",24);
		stu[3] = new Student("lily",21);
		stu[4] = new Student("tom",16);
		
		//��������
		for(int i=0;i<stu.length;i++){
			System.out.println("������"+stu[i].getName()+"---���䣺"+stu[i].getAge());
			
		}
		

	}

}
