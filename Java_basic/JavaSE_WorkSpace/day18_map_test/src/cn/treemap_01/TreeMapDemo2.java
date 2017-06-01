package cn.treemap_01;

import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap<Student,String>
 * ��:Student
 * ֵ��String
 * 
 * �洢�Զ������ʱ��1����Ȼ����
 *            2��ѡ��������
 */

public class TreeMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Student, String> tm = new TreeMap<Student, String>();

		// ����ѧ������
		Student s1 = new Student("�˰�", 30);
		Student s2 = new Student("���»�", 35);
		Student s3 = new Student("�Ʋ���", 33);
		Student s4 = new Student("����", 32);
		Student s5 = new Student("�Ʋ���", 33);

		// �洢Ԫ��
		tm.put(s1, "�γ�");
		tm.put(s2, "Ԫ��");
		tm.put(s3, "����");
		tm.put(s4, "�峯");
		tm.put(s5, "����");

		// ����
		Set<Student> set = tm.keySet();
		for (Student key : set) {
			String value = tm.get(key);
			System.out.println(key.getName() + "---" + key.getAge() + "---"
					+ value);
		}
	}

}
