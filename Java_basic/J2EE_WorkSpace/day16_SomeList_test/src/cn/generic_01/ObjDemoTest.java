package cn.generic_01;

public class ObjDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjDemo<String> om = new ObjDemo<String>();
		om.setObj(new String("Hello"));
		System.out.println(om.getObj());
		
		ObjDemo<Integer> om1 = new ObjDemo<Integer>();
		om1.setObj(new Integer(22));
		System.out.println(om1.getObj());

	}

}
