package cn.test.callback_;

import java.util.Scanner;

public class CallBackDemo {
	
	public static void main(String[] args) {
		// ��¼��ť
		Button loginBtn = new Button();
		// ע�ᰴť
		Button registerBtn = new Button();
		// �Զ����������
		setListener(loginBtn,registerBtn);
		System.out.println("����1:��¼");
		System.out.println("����2:ע��");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
        if(choice == 1){
        	// �ص�����
    		loginBtn.performClick();
        }else if(choice == 2){
        	registerBtn.performClick();
        }
		
		
	}
	
	/**
	 * Ԥ�水ť����¼�����Ӧ����
	 * @param loginBtn
	 * @param registerBtn
	 */
	private static void setListener(Button loginBtn,Button registerBtn){
		loginBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void click() {
				// TODO Auto-generated method stub
				System.out.println("ִ�е�¼ ");
				
			}
			
		});
		
		
		registerBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void click() {
			   System.out.println("ִ��ע��");
				
			}
			
		});
		
		
		
		
	}

}
