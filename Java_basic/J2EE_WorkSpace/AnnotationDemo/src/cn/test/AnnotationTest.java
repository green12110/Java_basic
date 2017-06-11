package cn.test;

import cn.en.TrafficLamp;
/*
 * ע������
 * 1��@SuppressWarnings("deprecation")
 *   ѹ�����棬���߱��������������ߣ���Ҫ��ʾ��ʱ�ķ���(��ɫ������û����)
 * 2��@Deprecated
 *   ��ʶ�˷����Ѿ���ʱ��
 *  gzggfvbm78ljh 
 *
 */
//���Զ����ע���������
//��ע������Ը�ֵ���൱�ڳ�Ա������ֵ
@ItcastAnnotation(color="RED",value="aaa",arrayAtt={3,4,5},
lamp=TrafficLamp.YELLOW,annotationAtt=@MetaAnnotation("hhh"),
classAtt=Integer.class)
public class AnnotationTest {
	
	@SuppressWarnings("deprecation")
	@ItcastAnnotation(value="bbb")
	public static void main(String[] args) {
		System.runFinalizersOnExit(true);
		//ͨ�����䣬����Ƿ����@ItcastAnnotationע��
		//�������,��õ�ItcastAnnotationע��Ķ���
		if(AnnotationTest.class.isAnnotationPresent(ItcastAnnotation.class)){
			ItcastAnnotation a = AnnotationTest.class.getAnnotation(ItcastAnnotation.class);
			//��ӡע��
			System.out.println(a);
			//��ӡע�������ֵ
			System.out.println(a.color());
			System.out.println(a.value()); //���aaa
			System.out.println(a.arrayAtt().length);
			System.out.println(a.lamp());
			System.out.println(a.annotationAtt().value());
			System.out.println(a.classAtt()); // ��� class java.lang.Integer
		}
	}
	
	@Deprecated
	public static void sayHello(){
		System.out.println("Hello Java");
	}

}
