package cn.ArrayList2;

import java.util.ArrayList;
import java.util.List;
/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */

public class ArrayList2Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> li1 = new ArrayList<Student>();
		Student s1 = new Student("唐僧",30);
		Student s2 = new Student("孙悟空",29);
		Student s3 = new Student("猪八戒",28);
		Student s4 = new Student("沙僧",34);
		Student s5 = new Student("白龙马",26);
		
		li1.add(s1);
		li1.add(s2);
		li1.add(s3);
		li1.add(s4);
		li1.add(s5);
		
		List<Student> li2 = new ArrayList<Student>();
		li2.add(new Student("诸葛亮",34));
		li2.add(new Student("周瑜",20));
		li2.add(new Student("刘备",31));
		
		List<Student> li3 = new ArrayList<Student>();
		li3.add(new Student("宋江",33));
		li3.add(new Student("吴用",22));
		li3.add(new Student("高俅",54));
		li3.add(new Student("李师师",29));
		
		List<List<Student>> biglist = new ArrayList<List<Student>>();
		biglist.add(li1);
		biglist.add(li2);
		biglist.add(li3);
		
		//遍历
		for(List<Student> array: biglist){
			for(Student s:array){
				System.out.println(s.getName()+"--"+s.getAge());				
				
			}
			System.out.println("******************");
		}
		
		
		
		
		

	}

}
