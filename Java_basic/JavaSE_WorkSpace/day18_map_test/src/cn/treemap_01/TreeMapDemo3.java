package cn.treemap_01;

import java.util.Comparator;
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

public class TreeMapDemo3 {
	public static void main(String[] args) {
		//�����ڲ���
		TreeMap<Stu, String> tm = new TreeMap<Stu, String>(new Comparator<Stu>(){
			public int compare(Stu s1,Stu s2){
				int num = s1.getAge()-s2.getAge();
				int num2 = num==0?s1.getName().compareTo(s2.getName()):num;
				return num2;
				
			}
		});

		// ����ѧ������
		Stu s1 = new Stu("�˰�", 30);
		Stu s2 = new Stu("���»�", 35);
		Stu s3 = new Stu("�Ʋ���", 33);
		Stu s4 = new Stu("����", 32);
		Stu s5 = new Stu("�Ʋ���", 33);

		// �洢Ԫ��
		tm.put(s1, "�γ�");
		tm.put(s2, "Ԫ��");
		tm.put(s3, "����");
		tm.put(s4, "�峯");
		tm.put(s5, "����");
		
		//����HashTree
		Set<Stu> set = tm.keySet();
		for(Stu key:set){
			String value = tm.get(key);
			System.out.println(key.getName()+"--"+key.getAge()+"--"+value);
			
		}
	}

}
