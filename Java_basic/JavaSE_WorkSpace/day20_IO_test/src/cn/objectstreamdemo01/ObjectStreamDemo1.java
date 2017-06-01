package cn.objectstreamdemo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *  ���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣
 *         ����--�����ݣ�ObjectOutputStream��
 *  �����л��������ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ��󡣡�
 *          ������--����ObjectInputStream��
 *          

 * 
 * */
public class ObjectStreamDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//���л������ǰѰ�����д���ı��ļ�
		write();
		//�����л����ı��ļ��е������� ��ԭ�ɶ���
		read();
	}
	
	
	/**
	 * �����л�
	 * @throws IOException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
    private static void read() throws IOException, ClassNotFoundException {
		// ����ObjectInputStream����
    	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("oos.txt"));
    	//��ȡ����
    	Person p =(Person)ois.readObject();
    	//�ر�
    	ois.close();
    	//��ӡ����
    	System.out.println(p);
	}


	/**
     * ���л�
     * @throws IOException
     */
	private static void write() throws IOException {
		FileOutputStream fos = new FileOutputStream("oos.txt");
		//����ObjectOutputStream����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//��������
		Person person = new Person("����",35);
		//��person����-�����л���
		oos.writeObject(person); //Person [name=����, age=0]
		//�ر���
		oos.close();
		
	}

}
