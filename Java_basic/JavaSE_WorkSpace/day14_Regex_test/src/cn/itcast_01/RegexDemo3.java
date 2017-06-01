package cn.itcast_01;
/*
 * 替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。 
 *      用于屏蔽字符
 */
public class RegexDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss="Hello8975475World3454Java457";
		String ss1 = ss.replaceAll("[0-9]", "*");
		String ss2 = ss.replaceAll("\\d+", "*");
		String ss3 = ss.replaceAll("\\d+", "");
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);

	}

}
