package cn.itcast_01;
/*
 * 我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 *		 学生：Student
 *		 成员变量：name,age
 *		 构造方法：无参,带参
 *		 成员方法：getXxx()/setXxx()
 *		 存储学生的数组?自己想想应该是什么样子的?
 * 分析：
 * 		A:创建学生类。
 * 		B:创建学生数组(对象数组)。
 * 		C:创建5个学生对象，并赋值。
 * 		D:把C步骤的元素，放到数组中。
 * 		E:遍历学生数组。
 */

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[5];
		
		stu[0] = new Student("Jack",18);
		stu[1] = new Student("merry",23);
		stu[2] = new Student("robert",24);
		stu[3] = new Student("lily",21);
		stu[4] = new Student("tom",16);
		
		//遍历数组
		for(int i=0;i<stu.length;i++){
			System.out.println("姓名："+stu[i].getName()+"---年龄："+stu[i].getAge());
			
		}
		

	}

}
