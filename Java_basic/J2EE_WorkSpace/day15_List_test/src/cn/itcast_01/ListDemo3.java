package cn.itcast_01;

import java.util.ArrayList;
import java.util.List;

/*
 * List���ϵ����б������ܣ�
 * 		size()��get()�������ʹ��
 */
public class ListDemo3 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("Hello");
		list.add("Java");
		list.add("Easy");
		
		for(int i=0;i<list.size();i++){
			String s =(String)list.get(i);
			System.out.println(s);
			
		}
	}

}
