package cn.itcast_01;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class IntorspectorTest {
	
   
    /**
     * ��ȡbean������
     * @throws IntrospectionException
     */
	@Test
	public  void test1() throws IntrospectionException {
		// TODO Auto-generated method stub
		BeanInfo bi = Introspector.getBeanInfo(Person.class,Object.class);
		//BeanInfo�ӿ�
		//PropertyDescriptor[] getPropertyDescriptors()  �õ�bean����������
		PropertyDescriptor[] pds = bi.getPropertyDescriptors();
		//����bean����������
		for(PropertyDescriptor p: pds){
			//Method m = p.getReadMethod();
			System.out.println(p.getName());
		}

	}
	
	/**
	 * ����bean������age
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		Person p = new Person();
		PropertyDescriptor ds = new PropertyDescriptor("age",Person.class);
		//�õ�д�����Է��� setAge()
		Method setAge = ds.getWriteMethod();
		//����Personʵ����setAge����������Ϊ17
		setAge.invoke(p, 17);
		//�õ�д�����෽��getAge()
		Method getAge = ds.getReadMethod();
		//����Personʵ����getAge����
		Integer age = (Integer)getAge.invoke(p);
		System.out.println(age.intValue());
		
		
	}
	
	/**
	 * @throws IntrospectionException 
	 * ��ȡbean���Ե�����
	 */
	@Test
	public void test3() throws IntrospectionException{
		PropertyDescriptor pd = new PropertyDescriptor("name",Person.class);
		Class type = pd.getPropertyType();
		System.out.println(type);
	}

}
