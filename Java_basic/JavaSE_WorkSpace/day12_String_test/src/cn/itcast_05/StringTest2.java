package cn.itcast_05;
/*
 * 替换功能
String replace(char old,char new)
String replace(String old,String new)
去除字符串两空格	
String trim()
按字典顺序比较两个字符串  
int compareTo(String str)
int compareToIgnoreCase(String str) 
 */
public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s ="Helloworld";
       //String replace(char old,char new)
       String s1 =s.replace('o', 'i');
       System.out.println(s1);
       System.out.println("-----------------");
       
       //String replace(String old,String new)
       String s2= s.replace("ll", "HI");
       System.out.println(s2);
       System.out.println("-----------------");
       
       int x1 = s.compareTo("ll");
       System.out.println(x1);
       int x2 = s.compareTo("zzz");
       System.out.println(x2);
       System.out.println("-----------------");
	}
}
