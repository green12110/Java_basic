package cn.reflect_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 获取所有方法
 *	getMethods
 *	getDeclaredMethods

 */

public class ReflectDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Class pc = Class.forName("cn.reflect_01.Person");
       //Method[] mts = pc.getMethods();
     /*  Method[] mts = pc.getDeclaredMethods();
       for(Method m : mts){
    	   System.out.println(m);
    	   
       }*/
       Constructor con = pc.getConstructor();
       Object obj = con.newInstance();
       
       //获取Person的     public void show()
       Method m1 = pc.getDeclaredMethod("show");
       m1.invoke(obj); //调用obj对象的m1方法
       System.out.println("--------------------");
       
     //获取Person的     public void method(String s)
       Method m2 = pc.getDeclaredMethod("method", String.class);
       m2.invoke(obj, "我爱北京天安门");
       System.out.println("--------------------");
       
       //获取  public String getString(String s, int i)
       Method m3 = pc.getDeclaredMethod("getString", String.class,int.class);
       m3.setAccessible(true);
       Object objStr = m3.invoke(obj, "林青霞",45);
       System.out.println(objStr);
       System.out.println("--------------------");
       
       // private void function()
       Method m4 = pc.getDeclaredMethod("function");
       m4.setAccessible(true);
       m4.invoke(obj);
       
       
	}

}
