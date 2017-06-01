package cn.objectstreamdemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  序列化流：把对象按照流一样的方式存入文本文件或是在网络中传输。
 *         对象--流数据（ObjectOutputStream）
 *  反序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象。、
 *          流数据--对象（ObjectInputStream）
 *          

 * 
 * */
public class ObjectStreamDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//序列化流就是把啊对象写入文本文件
		write();
		//反序列化把文本文件中的流数据 还原成对象
		read();
	}
	
	
	/**
	 * 反序列化
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
    private static void read() throws IOException, ClassNotFoundException {
		// 创建ObjectInputStream对象
    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
    	//读取对象
    	Person p =(Person)ois.readObject();
    	//关闭
    	ois.close();
    	//打印对象
    	System.out.println(p);
	}


	/**
     * 序列化
     * @throws IOException
     */
	private static void write() throws IOException {
		FileOutputStream fos = new FileOutputStream("oos.txt");
		//创建ObjectOutputStream对象
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//创建对象
		Person person = new Person("李四",35);
		//将person对象-》序列化流
		oos.writeObject(person); //Person [name=李四, age=0]
		//关闭流
		oos.close();
		
	}

}
