package cn.Rondom;

import java.util.Random;

/*
 * Random:�������������
 * 
 * ���췽����
 * 		public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰʱ��ĺ���ֵ
 *		public Random(long seed):����ָ��������
 *
 *		�������Ӻ�ÿ�εõ������������ͬ�ġ�
 *
 * ��Ա������
 * 		public int nextInt()�����ص���int��Χ�ڵ������
 *		public int nextInt(int n):���ص���[0,n)��Χ���������
 */

public class RondomDemo {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random(2345);
		for (int i = 0; i < 10; i++) {
			//δָ�����ӣ��õ��������ÿ�ζ���ͬ
			int num1 = r1.nextInt(10)+1;
			System.out.print(num1+"\t");
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			//���췽��ָ�����ӣ�ÿ�εõ������������ͬ��
			int num2 = r2.nextInt(200);
			System.out.print(num2+"\t");
		}
	}
}
