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
     * 获取bean的属相
     * @throws IntrospectionException
     */
	@Test
	public  void test1() throws IntrospectionException {
		// TODO Auto-generated method stub
		BeanInfo bi = Introspector.getBeanInfo(Person.class,Object.class);
		//BeanInfo接口
		//PropertyDescriptor[] getPropertyDescriptors()  得到bean的所有属性
		PropertyDescriptor[] pds = bi.getPropertyDescriptors();
		//遍历bean的所有属性
		for(PropertyDescriptor p: pds){
			//Method m = p.getReadMethod();
			System.out.println(p.getName());
		}

	}
	
	/**
	 * 操纵bean的属性age
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception{
		Person p = new Person();
		PropertyDescriptor ds = new PropertyDescriptor("age",Person.class);
		//得到写的属性方法 setAge()
		Method setAge = ds.getWriteMethod();
		//调用Person实例的setAge方法，参数为17
		setAge.invoke(p, 17);
		//得到写的属相方法getAge()
		Method getAge = ds.getReadMethod();
		//调用Person实例的getAge方法
		Integer age = (Integer)getAge.invoke(p);
		System.out.println(age.intValue());
		
		
	}
	
	/**
	 * @throws IntrospectionException 
	 * 获取bean属性的类型
	 */
	@Test
	public void test3() throws IntrospectionException{
		PropertyDescriptor pd = new PropertyDescriptor("name",Person.class);
		Class type = pd.getPropertyType();
		System.out.println(type);
	}

}
