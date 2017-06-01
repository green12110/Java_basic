package cn.itcast_02;

public class Student {
   private String name1;
   private int age;
   
   public int num =8;
   public final int num2 =4;
   public static final int num3 = 6;
   public static int num34 =8;
   
   public void setName(String name) {
	   this.name1 = name;  
   }
   
   public String getName() {
	   return name1;
   }
   
   public void setAge(int age) {
	   this.age = age;	   
   }
   
   public int getAge() {
	   return age;
   }
}
