package cn.itcast_01;

import java.util.List;
import java.util.ArrayList;

/*
 * List���ϵ����й��ܣ�
 * A:��ӹ���
 * 		void add(int index,Object element):��ָ��λ�����Ԫ��
 * B:��ȡ����
 * 		Object get(int index):��ȡָ��λ�õ�Ԫ��
 * C:�б������
 * 		ListIterator listIterator()��List�������еĵ�����
 * D:ɾ������
 * 		Object remove(int index)����������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 * E:�޸Ĺ���
 * 		Object set(int index,Object element):���������޸�Ԫ�أ����ر����ε�Ԫ��
 */

public class ListDemo2 {
	public static void main(String[] args) {
		List li = new ArrayList();
		String s1 = "Hello";
		String s2 = "Gewen";
		String s3 = "Java";
		String s4 = "Easy";
		
		/*li.add(s1);
		li.add(s2);
		li.add(s1);
		li.add(s3);*/
		
		li.add(0,s1);
		li.add(1,s2);
		li.add(1,s3);
		//li.add(1,s1);
		
		System.out.println(li);
		
	}

}
