package cn.asList_01;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):������ת�ɼ���
 * 
 * ע�����
 * 		��Ȼ���԰�����ת�ɼ��ϣ����Ǽ��ϵĳ��Ȳ��ܸı䡣
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
