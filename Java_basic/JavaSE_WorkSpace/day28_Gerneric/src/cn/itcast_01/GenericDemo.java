package cn.itcast_01;

import org.junit.Test;

public class GenericDemo {
	
	public <T> T genertic(T t){
		return t;
	}
	
	@Test
	public void test(){
		String str = genertic("aa");
		System.out.println(str);
	}

}
