package cn.System;
/*
 * System�����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
 * 
 * ������
 * 		public static void gc()������������������ 
 *		public static void exit(int status):��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ�� 
 *		public static long currentTimeMillis():�����Ժ���Ϊ��λ�ĵ�ǰʱ��
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */

public class SystemDSemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ϲ������");
		//System.exit(0);
		System.out.println("��Ҳϲ����Ѷ����");
		System.out.println(System.currentTimeMillis());
		//���ڼ�������һ�γ����ʱ�䣨���ٺ��룩
		long start = System.currentTimeMillis();
		for(int i=1;i<=1000;i++){
			System.out.println("�����"+i+"��\tHello");
		}
		long end = System.currentTimeMillis();
		System.out.println("------------");
		System.out.println(end-start);

	}

}
