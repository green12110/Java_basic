package cn.digui_02;

/*
 * 需求：请用代码实现求5的阶乘。
 */

public class JiChengTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("5的阶乘："+jieCheng(5));
           
	}
	
	public static int jieCheng(int num){
		if(num==1){
			return 1;
		}else{
			return num*jieCheng(num-1);
		}
		
	}

}
