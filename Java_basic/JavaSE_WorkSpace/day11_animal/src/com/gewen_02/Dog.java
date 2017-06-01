package com.gewen_02;
/**
 * 这是具体狗的实现类
 * @author 葛雯
 * @version 1.0
 */
import com.gewen_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("狗会跳高");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
        System.out.println("狗吃肉");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("狗站着睡觉");

	}

}
