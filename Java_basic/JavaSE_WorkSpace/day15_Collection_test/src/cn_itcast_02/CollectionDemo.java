package cn_itcast_02;

import java.util.ArrayList;
import java.util.Collection;
/*
 * Collection:�Ǽ��ϵĶ���ӿڣ���������ϵ���ظ��ģ���Ψһ�ģ�������ģ�������ġ�(����������Ľ���)
 * 
 * Collection�Ĺ��ܸ�����
 * 1����ӹ���
 * 		boolean add(Object obj):���һ��Ԫ��
 * 		boolean addAll(Collection c):���һ�����ϵ�Ԫ��
 * 2:ɾ������
 * 		void clear():�Ƴ�����Ԫ��
 * 		boolean remove(Object o):�Ƴ�һ��Ԫ��
 * 		boolean removeAll(Collection c):�Ƴ�һ�����ϵ�Ԫ��(��һ����������)
 * 3:�жϹ���
 * 		boolean contains(Object o)���жϼ������Ƿ����ָ����Ԫ��
 * 		boolean containsAll(Collection c)���жϼ������Ƿ����ָ���ļ���Ԫ��(��һ����������)
 * 		boolean isEmpty()���жϼ����Ƿ�Ϊ��
 * 4:��ȡ����
 * 		Iterator<E> iterator()(�ص�)
 * 5:���ȹ���
 * 		int size():Ԫ�صĸ���
 * 		�����⣺������û��length()������?�ַ�����û��length()������?������û��length()������?
 * 6:��������
 * 		boolean retainAll(Collection c):�������϶��е�Ԫ��?˼��Ԫ��ȥ���ˣ����ص�boolean����ʲô��˼��?
 * 7���Ѽ���ת��Ϊ����
 * 		Object[] toArray()
 */


public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student st1 = new Student();
		Collection c = new ArrayList();
		//System.out.println("add:"+c.add("gewen"));
		c.add("Hello");
		c.add("world");
		c.add("Java");
		//System.out.println(c); 
		//System.out.println("remove:"+c.remove("Hello"));
	    c.clear();
		//System.out.println("contains:"+c.contains("Hello"));
		//System.out.println("contains:"+c.contains("contains"));
		System.out.println("isEmpty:"+c.isEmpty());
		System.out.println(c);     //��д��toString����
		System.out.println("Ԫ�ظ�����" +c.size());
		//boolean add(Object obj)

	}

}
