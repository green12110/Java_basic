package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReviceDemo {
	
	public static void main(String[] args) throws IOException {
		//����Socket����
		DatagramSocket ds = new DatagramSocket(12345);
		
		byte[] buf = new byte[1024];	
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		//��������
		ds.receive(dp);
		
		//��������
		System.out.println("from "+dp.getAddress().getHostAddress()+" data "+new String(dp.getData(),0,dp.getLength(),"GBK"));
		
		//�ͷ���Դ
		ds.close();
	}

}
