package cn.test.callback_;

import java.util.Scanner;

public class CallBackDemo {
	
	public static void main(String[] args) {
		// 登录按钮
		Button loginBtn = new Button();
		// 注册按钮
		Button registerBtn = new Button();
		// 自定义监听方法
		setListener(loginBtn,registerBtn);
		System.out.println("输入1:登录");
		System.out.println("输入2:注册");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
        if(choice == 1){
        	// 回调方法
    		loginBtn.performClick();
        }else if(choice == 2){
        	registerBtn.performClick();
        }
		
		
	}
	
	/**
	 * 预存按钮点击事件的响应代码
	 * @param loginBtn
	 * @param registerBtn
	 */
	private static void setListener(Button loginBtn,Button registerBtn){
		loginBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("执行登录 ");
				
			}
			
		});
		
		
		registerBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void click() {
			   System.out.println("执行注册");
				
			}
			
		});
		
		
		
		
	}

}
