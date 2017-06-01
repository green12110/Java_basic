package cn.itcast_07;
/*
 * StringBuffer的添加功能
 * append
 * insert
 */

public class StringBufferDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuffer sb = new StringBuffer();
         sb.append("gewen");
         System.out.println(sb.capacity());
         sb.append('D');
         char[] str = {'H','E','L','L','O'};
         sb.append(str);
         sb.append(12.456F);
         System.out.println(sb.capacity());
         System.out.println(sb);
         
         sb.insert(5, "HHHH");
         sb.insert(5, true);
         System.out.println(sb);
	}

}
