package cn_itcast_02;

import java.util.ArrayList;
import java.util.Collection;
/*
 * ���ϵı�������ʵ�������λ�ȡ�����е�ÿһ��Ԫ�ء�
 * 
 * Object[] toArray():�Ѽ���ת�����飬����ʵ�ּ��ϵı���
 */

public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		c.add("Hello");
		c.add("world");
		c.add("java");
		
		//����ת����
		Object[] obj = c.toArray();
		for(int i=0;i<c.size();i++){
			String s = (String)obj[i];
			System.out.println(s+"-----���ȣ�"+s.length());
			
		}

	}

}
