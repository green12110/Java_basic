package cn.itcast_01;
/*
 * Integer的构造方法：
 * public Integer(int value)
 * public Integer(String s)
 * 		注意：这个字符串必须是由数字字符组成
 */
public class IntegerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer t1 = new Integer(10);
     System.out.println(t1);
     
     Integer t2 = new Integer("231");
     System.out.println(t2);
     
     String s="755";
     //String s="agf";  //报错NumberFormatException
     Integer t3 = new Integer(s);
     System.out.println(t3);
	}

}
