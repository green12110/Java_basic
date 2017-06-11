package cn.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.en.TrafficLamp;

/*
 * �Զ���һ��ע��
 * ע��������� �൱�ڷ���
 *
 */
//Ԫע�⣨ע���ע�⣩@Retention���Ǹ��������ڣ�Դ���룬class�ļ�������
//@Target ˵������ע����ʲô�ط�ʹ��
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface ItcastAnnotation {
	//ָ�����Ե�Ĭ��ֵ
	String color() default "blue";
	
	//�����ע�����ԣ��ڸ�ֵʱ����ֱ�Ӹ�ֵ
	String value();
	
	//ע������ԣ���������
	int[] arrayAtt() default {1,2,3};
	
	//ע������ԣ�ö������
	TrafficLamp lamp() default TrafficLamp.GREEN;
	
	//ע������ԣ�ע������
	MetaAnnotation annotationAtt() default @MetaAnnotation("gggg");
	
	//ע������ԣ�Class����
	Class classAtt() default String.class;

}
