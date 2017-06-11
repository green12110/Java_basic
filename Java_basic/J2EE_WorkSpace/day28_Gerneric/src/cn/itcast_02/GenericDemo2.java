package cn.itcast_02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

/**
 * һ����������
 * ArrayList<E> ��������
 *           E  ���ͱ��� �� ���Ͳ���
 *           
 * ArrayList<Integer> ������������
 *           Integer  ���Ͳ�����ʵ�� �� ʵ�����Ͳ���
 * 
 *  ArrayList ԭʼ����
 * 
 * ����ͨ���<?>
 *  ���ڴ�ӡ������������ͼ����е��������ݣ����ʵ�֣�
 *
 */

public class GenericDemo2 {
	 public static void main(String[] args) {
		 List<String> list1 = new ArrayList<String>();
		 list1.add("angle");
		 list1.add("carolin");
		 List<Integer> list2 = new ArrayList<Integer>();
		 list2.add(12);
		 list2.add(34);
		 list2.add(9);
		 
		 //����printAnyCollection��������
		 printAnyCollection(list1);
		 System.out.println("------------");
		 printAnyCollection(list2);
		 
		
	}
	 
	 public static void printAnyCollection(Collection<?> collection){
		 //collection.add(12);   //����
		//ʹ��ͨ�����ֻ�ܵ���������޹صķ���
		 System.out.println(collection.size());
		 for(Object obj:collection){
			 System.out.println(obj);
		 }
		 
		 
	 }

}
