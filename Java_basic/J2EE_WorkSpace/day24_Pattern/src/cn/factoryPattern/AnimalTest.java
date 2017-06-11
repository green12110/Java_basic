package cn.factoryPattern;
/**
 * �򵥹���ģʽ
 * 
 * */
public class AnimalTest {
	public static void main(String[] args) {
		//ֱ�Ӵ�������
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
	    System.out.println("----------------");
	    
		//ʹ�ù���������������
		Animal a = AnimalFactory.createAnimal("dog");
		if(a!=null){
		a.eat();
		}else{
			System.out.println("���ṩ���ֶ���");
		}
		
	}

}
