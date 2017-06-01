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

//使用BeanUtil操作bean的属性
public class BeanUtilDemo {
  
	@Test
	public void test1() throws Exception{
		Person p = new Person();
		//设置bean属性的值
		BeanUtils.setProperty(p, "age", 45);
		//获取bean属性的值
		String ageVal = BeanUtils.getProperty(p, "age");
		String nameVal = BeanUtils.getProperty(p, "name");
		String addVal = BeanUtils.getProperty(p, "name");
		//打印bean各属性的值
		System.out.println(ageVal+"---"+nameVal+"---"+addVal);
		
	}
	
	@Test
	public void test2() throws IllegalAccessException, InvocationTargetException{
		//从网页提交过来的数据都是String 类型的
		String name = "张三";
		String age = "23";
		String address = "大连市甘井子区";
		String birthday = "1992-02-16";
		//String birthday = "";
		
		Person p = new Person();
		//日期类型转换器
		ConvertUtils.register(new Converter(){

			@Override
			public <T> T convert(Class<T> type, Object value) {
				if(value == null){
					return null;
				}
				if(!(value instanceof String)){
					
					throw new ConversionException("只转换String类型的"); 
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
		//是支持8种基本数据类型的转换不支持String转成Date。需要 注册一个类型转换器
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getBirthday());
	}
	
	@Test
	public void test3() throws IllegalAccessException, InvocationTargetException{
		
		String name = "张三";
		String age = "23";
		String address = "大连市甘井子区";
		String birthday = "1992-02-16";
//		String birthday = "";
		//DateLocaleConverter类实现了Converter接口
		ConvertUtils.register(new DateLocaleConverter(), Date.class);
		Person p = new Person();
		BeanUtils.setProperty(p, "name", name);
		BeanUtils.setProperty(p, "age", age);
		BeanUtils.setProperty(p, "address", address);
		//是支持8种基本数据类型的转换不支持String转成Date。需要 注册一个类型转换器
		BeanUtils.setProperty(p, "birthday", birthday);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddress());
		System.out.println(p.getBirthday());
		
		
	}
	
	/**
	 * 将Map集合中的值填充到Bean中的属性
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	@Test
	public void test4() throws IllegalAccessException, InvocationTargetException{
		Map<String,String> map = new HashMap<String,String>();
		//map的key值要和Bean属性值一致
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
