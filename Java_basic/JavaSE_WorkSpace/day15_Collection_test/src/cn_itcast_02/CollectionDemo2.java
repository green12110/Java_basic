package cn_itcast_02;

import java.util.ArrayList;
import java.util.Collection;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 */

public class CollectionDemo2 {
	public static void main(String[] args) {
		//创建集合c1
		Collection c1 = new ArrayList();
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		
		//创建集合c2
		Collection c2 = new ArrayList();
	/*	c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c2.add("abc4");*/
		c2.add("abc5");
		c2.add("abc6");
		c2.add("abc7");
		c2.add("abc8");
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c2);
		
		//boolean addAll(Collection c):添加一个集合的元素,包括重复的
		//c1.addAll(c2);
		//System.out.println("addAll"+c1);
		
		//boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
		//System.out.println("removeAll:"+c1.removeAll(c2));
		//System.out.println("c1:"+c1);
		
		// boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
		//System.out.println("containsAll:"+c1.containsAll(c2));
		System.out.println("retainAll:"+c1.retainAll(c2));
		System.out.println("c1:"+c1);
		
	}

}
