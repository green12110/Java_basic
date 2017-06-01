package cn.itcast_06;

/*
 *  * 需求：把数组中的数据按照指定个格式拼接成一个字符串(改进版)
 * 举例：
 * 		int[] arr = {1,2,3};	
 * 输出结果：
 *		"[1, 2, 3]"
 */
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3 };
	    String ss = printStr(arr);
	    System.out.println(ss);

	}

	public static String printStr(int[] arr) {
		// 定义一个字符串s，内容为空
		String s = "";
		// 拼接左面的括号【
		s = s + "[";
		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			if (i == (arr.length - 1)) {
				s += arr[i] + "]";
			} else {
				s += arr[i] + ",";
			}
		}
		
		return s;

	}

}
