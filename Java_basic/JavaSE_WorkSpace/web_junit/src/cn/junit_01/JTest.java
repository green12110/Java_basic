package cn.junit_01;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JTest {
	private Person p;
	@Before
	public void before(){
		System.out.println("Before");
		p = new Person();
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	
	@Test
	public void testRun(){ 
	 assertEquals("Hell44o", p.run());
		
	}
	
	@Test
	public void testEat(){
		Person p = new Person();
		p.eat();
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass");
	}
	
	@After
	public void  after(){
		System.out.println("After");
		p=null;
	}

}
