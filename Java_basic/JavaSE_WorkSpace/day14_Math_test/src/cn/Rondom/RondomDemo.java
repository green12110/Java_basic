package cn.Rondom;

import java.util.Random;

/*
 * Random:产生随机数的类
 * 
 * 构造方法：
 * 		public Random():没有给种子，用的是默认种子，是当前时间的毫秒值
 *		public Random(long seed):给出指定的种子
 *
 *		给定种子后，每次得到的随机数是相同的。
 *
 * 成员方法：
 * 		public int nextInt()：返回的是int范围内的随机数
 *		public int nextInt(int n):返回的是[0,n)范围的内随机数
 */

public class RondomDemo {
	public static void main(String[] args) {
		Random r1 = new Random();
		Random r2 = new Random(2345);
		for (int i = 0; i < 10; i++) {
			//未指定种子，得到的随机数每次都不同
			int num1 = r1.nextInt(10)+1;
			System.out.print(num1+"\t");
		}
		
		System.out.println();
		for (int i = 0; i < 10; i++) {
			//构造方法指定种子，每次得到的随机数是相同的
			int num2 = r2.nextInt(200);
			System.out.print(num2+"\t");
		}
	}
}
