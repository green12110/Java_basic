package cn.factoryPattern;
/**
 * 简单工厂模式
 * 
 * */
public class AnimalTest {
	public static void main(String[] args) {
		//直接创建对象
		Dog dog = new Dog();
		dog.eat();
		Cat cat = new Cat();
		cat.eat();
	    System.out.println("----------------");
	    
		//使用工厂类来创建对象
		Animal a = AnimalFactory.createAnimal("dog");
		if(a!=null){
		a.eat();
		}else{
			System.out.println("不提供这种动物");
		}
		
	}

}
