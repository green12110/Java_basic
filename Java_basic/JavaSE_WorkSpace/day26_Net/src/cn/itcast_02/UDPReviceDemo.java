package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.activation.MailcapCommandMap;

/*
 *  UDP协议接收数据
 * A:创建接收端Socket对象
 * B:创建一个数据包(接收容器)
 * C:调用Socket对象的接收方法接收数据
 * D:解析数据包，并显示在控制台
 * E:释放资源
 * 
 * 
 */


public class UDPReviceDemo {
	
	public static void main(String[] args) throws IOException {
		//DatagramSocket(int port) 创建数据报套接字并将其绑定到本地主机上的指定端口。
		DatagramSocket ds = new DatagramSocket(10086);
		//DatagramPacket(byte[] buf, int length) 用来接收长度为 length 的数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		ds.receive(dp);
		
		byte[] data = dp.getData();
		int length = dp.getLength();
		InetAddress address = dp.getAddress();
		String ip = address.getHostAddress();
	    
		System.out.println(ip+"==="+new String(data,0,length,"GBK"));
		
		ds.close();
	}

}
