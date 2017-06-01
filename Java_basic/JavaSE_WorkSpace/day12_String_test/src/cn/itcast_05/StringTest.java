package cn.itcast_05;
/*
 * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
 * 举例：
 * 		helloWORLD
 * 结果：
 * 		Helloworld
 * 
 * 分析：
 * 		A:先获取第一个字符
 * 		B:获取除了第一个字符以外的字符
 * 		C:把A转成大写
 * 		D:把B转成小写
 * 		E:C拼接D
 */
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s ="HelloWORLD";
       
       String s1 =s.substring(0, 1);
       String s2 =s.substring(1);
       String das = s1.toUpperCase();
       String xiaos = s2.toLowerCase();
       String ss = das.concat(xiaos);
       System.out.println(ss);
       
       //优化代码
       String ss2 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
       System.out.println(ss2);
	}

}
