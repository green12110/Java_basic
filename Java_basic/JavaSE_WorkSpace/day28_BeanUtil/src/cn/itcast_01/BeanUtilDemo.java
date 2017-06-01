package cn.itcast_01;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.junit.Test;

//ʹ��BeanUtil����bean������
public class BeanUtilDemo {
  
	@Test
	public void test1() throws Exception{
		Person p = new Person();
		//����bean���Ե�ֵ
		BeanUtils.setProperty(p, "age", 45);
		//��ȡbean���Ե�ֵ
		String ageVal = BeanUtils.getProperty(p, "age");
		String nameVal = BeanUtils.getProperty(p, "name");
		String addVal = BeanUtils.getProperty(p, "name");
		//��ӡbean�����Ե�ֵ
		System.out.println(ageVal+"---"+nameVal+"---"+addVal);
		
	}
	
	@Test
	public void test2() throws IllegalAccessException, InvocationTargetException{
		//����ҳ�ύ���������ݶ���String ���͵�
		String name = "����";
		String age = "23";
		String address = "�����иʾ�����";
		String birthday = "1992-02-16";
		//String birthday = "";
		
		Person p = new Person();
		//��������ת����
		ConvertUtils.register(new Converter(){

			@Override
			public <T> T convert(Class<T> type, Object value) {
				if(value == null){
					return null;
				}
				if(!(value instanceof String)){
					
					throw new ConversionException("ֻת��String���͵�"); 
				}
				String val= (String)value;
				if(val.trim().equals("")){
					return null;	
				}
				Date d = null;
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			    try {
					 d = sdf.parse(val);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException(e);
				}
				return (T) d;
			}
			
		}, Date.class);
		
		
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "address", address);
		//��֧��8�ֻ����������͵�ת����֧��Stringת��Date����Ҫ ע��һ������ת����
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getBirthday());
	}
	
	@Test
	public void test3() throws IllegalAccessException, InvocationTargetException{
		
		String name = "����";
		String age = "23";
		String address = "�����иʾ�����";
		String birthday = "1992-02-16";
//		String birthday = "";
		//DateLocaleConverter��ʵ����Converter�ӿ�
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "address", address);
		//��֧��8�ֻ����������͵�ת����֧��Stringת��Date����Ҫ ע��һ������ת����
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getBirthday());
		
		
	}
	
	/**
	 * ��Map�����е�ֵ��䵽Bean�е�����
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void test4() throws IllegalAccessException, InvocationTargetException{
		Map<String,String> map = new HashMap<String,String>();
		//map��keyֵҪ��Bean����ֵһ��
		map.put("name", "Lily");
		map.put("age", "12");
		map.put("address", "New York");
		map.put("birthday", "1980-05-22");
		
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		
		Person p = new Person();
		BeanUtils.populate(p, map);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getBirthday());
		
		
		
	}
}
