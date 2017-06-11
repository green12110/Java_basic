package cn.asList_01;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):把数组转成集合
 * 
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
 */

public class AsListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] str = {"Hello","Java","Easy"};
		List<String> li =Arrays.asList("Hello","Java","Easy");
		
		for(String s:li){
			System.out.println(s);
			
		}

	}

}
