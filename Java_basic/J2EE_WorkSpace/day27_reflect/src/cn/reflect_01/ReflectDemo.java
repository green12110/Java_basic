package cn.reflect_01;
/*
* 反射：就是通过class文件对象，去使用该文件中的成员变量，构造方法，成员方法。
* 
* Person p = new Person();
* p.使用
* 
* 要想这样使用，首先你必须得到class文件对象，其实也就是得到Class类的对象。
* Class类：
* 		成员变量	Field
* 		构造方法	Constructor
* 		成员方法	Method
* 
* 获取class文件对象的方式：
* A:Object类的getClass()方法
* B:数据类型的静态属性class
* C:Class类中的静态方法
* 		public static Class forName(String className)
* 
* 一般我们到底使用谁呢?
* 		A:自己玩	任选一种，第二种比较方便
* 		B:开发	第三种
* 			为什么呢?因为第三种是一个字符串，而不是一个具体的类名。这样我们就可以把这样的字符串配置到配置文件中。
*/

public class ReflectDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//Object类的getClass()方法
		Person per = new Person();
		System.out.println(per.getClass());
		
		//数据类型的静态属性class
		Class c = Integer.class;
		System.out.println(c);
		Class pc = Person.class;
		System.out.println(pc);
		
		//Class类中的静态方法
		System.out.println(Class.forName("cn.reflect_01.Person"));
		
		//isPrimitive()是否是原始类型
		System.out.println(pc.isPrimitive());
		System.out.println(String.class.isPrimitive());  //false
		System.out.println(int.class.isPrimitive());     //true
		//Integer.TYPE 得到基本类型字节码
		System.out.println(int.class == Integer.TYPE);  //true
		//判断数组类型是否是基本类型字节码
		System.out.println(int[].class.isPrimitive());  //false
		//isArray()是否是数组类型字节码
		System.out.println(int[].class.isArray());   //true
	}

}
