package com.gewen_02;
/**
 * ���Ǿ��幷��ʵ����
 * @author ����
 * @version 1.0
 */
import com.gewen_01.Jump;

public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("��������");

	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
        System.out.println("������");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("��վ��˯��");

	}

}
