package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;
/*
 * ���ϵ�Ƕ�ױ���
 * ����
 * 		���ǰ���ѧ����ÿһ��ѧ���ǲ���һ�������������ǿ���ʹ��һ�����ϱ�ʾ���ǰ༶��ѧ����ArrayList<Student>
 * 		�����أ������Ա��ǲ��ǻ��а༶��ÿ���༶�ǲ���Ҳ��һ��ArrayList<Student>��
 * 		���������ж��ArrayList<Student>��ҲҪ�ü��ϴ洢����ô����?
 * 		����������ӵģ�ArrayList<ArrayList<Student>>
 */

public class ArrayList2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li1 = new ArrayList<Student>();
		Student s1 = new Student("��ɮ",30);
		Student s2 = new Student("�����",29);
		Student s3 = new Student("��˽�",28);
		Student s4 = new Student("ɳɮ",34);
		Student s5 = new Student("������",26);
		
		li1.add(s1);
		li1.add(s2);
		li1.add(s3);
		li1.add(s4);
		li1.add(s5);
		
		List<Student> li2 = new ArrayList<Student>();
		li2.add(new Student("�����",34));
		li2.add(new Student("���",20));
		li2.add(new Student("����",31));
		
		List<Student> li3 = new ArrayList<Student>();
		li3.add(new Student("�ν�",33));
		li3.add(new Student("����",22));
		li3.add(new Student("��ٴ",54));
		li3.add(new Student("��ʦʦ",29));
		
		List<List<Student>> biglist = new ArrayList<List<Student>>();
		biglist.add(li1);
		biglist.add(li2);
		biglist.add(li3);
		
		//����
		for(List<Student> array: biglist){
			for(Student s:array){
				System.out.println(s.getName()+"--"+s.getAge());				
				
			}
			System.out.println("******************");
		}
		
		
		
		
		

	}

}
