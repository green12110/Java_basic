package cn.test;

import cn.en.TrafficLamp;
/*
 * 注解作用
 * 1、@SuppressWarnings("deprecation")
 *   压缩警告，告诉编译器（开发工具）不要提示过时的方法(黄色警告线没有了)
 * 2、@Deprecated
 *   标识此方法已经过时了
 *  gzggfvbm78ljh 
 *
 */
//将自定义的注解加在类上
//将注解的属性赋值，相当于成员变量赋值
@ItcastAnnotation(color="RED",value="aaa",arrayAtt={3,4,5},
lamp=TrafficLamp.YELLOW,annotationAtt=@MetaAnnotation("hhh"),
classAtt=Integer.class)
public class AnnotationTest {
	
	@SuppressWarnings("deprecation")
	@ItcastAnnotation(value="bbb")
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
		//通过反射，检查是否加了@ItcastAnnotation注解
		//如果加了,则得到ItcastAnnotation注解的对象
		if(AnnotationTest.class.isAnnotationPresent(ItcastAnnotation.class)){
			ItcastAnnotation a = AnnotationTest.class.getAnnotation(ItcastAnnotation.class);
			//打印注解
			System.out.println(a);
			//打印注解的属性值
			System.out.println(a.color());
			System.out.println(a.value()); //输出aaa
			System.out.println(a.arrayAtt().length);
			System.out.println(a.lamp());
			System.out.println(a.annotationAtt().value());
			System.out.println(a.classAtt()); // 输出 class java.lang.Integer
		}
	}
	
	@Deprecated
	public static void sayHello(){
		System.out.println("Hello Java");
	}

}
