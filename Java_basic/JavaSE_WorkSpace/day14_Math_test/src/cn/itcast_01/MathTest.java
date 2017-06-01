package cn.itcast_01;

/*
 * Math:������ѧ������ࡣ
 * ��Ա������
 * 		public static final double PI
 * 		public static final double E
 * ��Ա������
 * 		public static int abs(int a)������ֵ
 *		public static double ceil(double a):����ȡ��
 *		public static double floor(double a):����ȡ��
 *		public static int max(int a,int b):���ֵ (min��ѧ)
 *		public static double pow(double a,double b):a��b����
 *		public static double random():����� [0.0,1.0)
 *		public static int round(float a) ��������(����Ϊdouble����ѧ)
 *		public static double sqrt(double a):��ƽ����
 */

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PI:"+Math.PI);
		System.out.println("PI:"+Math.E);
		System.out.println("-----------------");
		
		System.out.println("abs:" + Math.abs(-5));
		System.out.println("abs:" + Math.abs(-5.9));
		System.out.println("-----------------");

		// ����ȡ��
		System.out.println("ceil:" + Math.ceil(5.1));
		System.out.println("ceil:" + Math.ceil(-5.1));
		System.out.println("-----------------");

		// ����ȡ��
		System.out.println("floor:" + Math.floor(5.9));
		System.out.println("floor:" + Math.floor(-5.1));
		System.out.println("-----------------");

		// ���ֵ
		System.out.println("max:" + Math.max(6, 3.2));
		// ��Сֵ
		System.out.println("min:" + Math.min(6, 3.2));
		System.out.println("-----------------");

		// a��b����
		System.out.println("pow:" + Math.pow(2, 4));
		System.out.println("pow:" + Math.pow(2.1, 4));
		System.out.println("-----------------");

		// �����,����[0.0,1.0]��Χ��
		for (int i = 1; i <=10; i++) {
			System.out.println("random\t��"+i+"������"+ Math.random());
		}
		// ��ȡһ��1-100֮��������
		System.out.println("random[1,100]��"+ ((int)(Math.random()*100)+1));
		System.out.println("-----------------");
		
		//��������
		System.out.println("round:"+Math.round(4.5));
		System.out.println("round:"+Math.round(4.0001));
		System.out.println("-----------------");
		
		//��ƽ����
		System.out.println("sqrt:"+Math.sqrt(5.7));
		System.out.println("sqrt:"+Math.sqrt(4));

	}

}
