package cn.digui_02;

/*
 * �������ô���ʵ����5�Ľ׳ˡ�
 */

public class JiChengTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("5�Ľ׳ˣ�"+jieCheng(5));
           
	}
	
	public static int jieCheng(int num){
		if(num==1){
			return 1;
		}else{
			return num*jieCheng(num-1);
		}
		
	}

}
