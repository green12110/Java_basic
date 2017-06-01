package cn.junit_01;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void test() {
		Calcutlator c = new Calcutlator();
		int res = c.add(2, 4);
		assertEquals("结果不通过", 6, res);
	}

}
