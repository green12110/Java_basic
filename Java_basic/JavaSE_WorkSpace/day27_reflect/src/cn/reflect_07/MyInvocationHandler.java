package cn.reflect_07;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{
	private Object target; //目标对象
	
	public MyInvocationHandler(Object target){
		this.target = target;
		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("校验权限");
		Object result = method.invoke(target, args);
		System.out.println("记录日志");
		return result;
	}

}
