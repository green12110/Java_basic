package cn.hashmap01;

import java.util.HashMap;
import java.util.Set;

/*
 * HashMap<Student,String>
 * ����Student
 * 		Ҫ�������������ĳ�Ա����ֵ����ͬ����Ϊͬһ������
 * (��дStudent���hashcode()��equals())
 * ֵ��String
 */

public class HashMapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student, String> hm = new HashMap<Student, String>();

		// ����ѧ������
		Student s1 = new Student("����", 27);
		Student s2 = new Student("���Ѿ�", 30);
		Student s3 = new Student("��ʩ", 33);
		Student s4 = new Student("����", 35);
		Student s5 = new Student("����", 27);

		// ���Ԫ��
		hm.put(s1, "8888");
		hm.put(s2, "6666");
		hm.put(s3, "5555");
		hm.put(s4, "7777");
		hm.put(s5, "9999");
		
		//����hashmap
		Set<Student> set = hm.keySet();
		for(Student key:set){
			String value = hm.get(key);
			System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
			
		}

	}

}
