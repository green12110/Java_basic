package cn.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.en.TrafficLamp;

/*
 * 自定义一个注解
 * 注解类的属性 相当于方法
 *
 */
//元注解（注解的注解）@Retention在那个生命周期（源代码，class文件）保存
//@Target 说明将此注解在什么地方使用
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface ItcastAnnotation {
	//指定属性的默认值
	String color() default "blue";
	
	//特殊的注解属性，在赋值时可以直接赋值
	String value();
	
	//注解的属性，数组类型
	int[] arrayAtt() default {1,2,3};
	
	//注解的属性，枚举类型
	TrafficLamp lamp() default TrafficLamp.GREEN;
	
	//注解的属性，注解类型
	MetaAnnotation annotationAtt() default @MetaAnnotation("gggg");
	
	//注解的属性，Class类型
	Class classAtt() default String.class;

}
