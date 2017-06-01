package com.gewen_02;
/**
 * 这是具体的猫类
 * @author 葛雯
 * @version 1.0
 *
 */

public class Cat extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
        System.out.println("猫吃鱼");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
        System.out.println("猫躺着睡觉");
	}

}
