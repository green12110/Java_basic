package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReviceDemo {
	
	public static void main(String[] args) throws IOException {
		//创建Socket对象
		DatagramSocket ds = new DatagramSocket(12345);
		
		byte[] buf = new byte[1024];	
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		//接收数据
		ds.receive(dp);
		
		//解析数据
		System.out.println("from "+dp.getAddress().getHostAddress()+" data "+new String(dp.getData(),0,dp.getLength(),"GBK"));
		
		//释放资源
		ds.close();
	}

}
