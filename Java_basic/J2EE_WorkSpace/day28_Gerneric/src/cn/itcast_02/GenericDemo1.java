package cn.itcast_02;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ͣ����߱�����������������޶������е��������ͣ�ȡ����Ԫ�ص�ʱ����Ҫǿ������ת���ˡ�
 * �����ȥ��������Ϣ��
 * ע�⣺����ͨ�������������벻ͨ�������͵�Ԫ�ء�
 *     ��Ϊ����ֻ�����������
 * @author Administrator
 *
 */

public class GenericDemo1 {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Collection<String> collection1 = new ArrayList<String>();
		ArrayList<Integer> collection2 = new ArrayList<Integer>();
	    System.out.println(collection1.getClass() == collection2.getClass());
	    //true, �ֽ����ļ���ͬ
	    
	    //��collection2�����Ԫ��
	    collection2.add(12);
	    collection2.add(32);
	    
	    //ͨ�����䣬���һ��String���͵�Ԫ��
	    collection2.getClass().getMethod("add", Object.class).invoke(collection2, "adb");
	    
	    
	    //����collection2
	    for(int i=0;i<collection2.size();i++){
	    	System.out.println(collection2.get(i));
	    	
	    }
	}

}
