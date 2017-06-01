package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * UDP协议发送数据：
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D:释放资源
 */
public class UDPSendDemo {
	
	public static void main(String[] args) throws IOException {
		// 创建Socket对象
		DatagramSocket ds = new DatagramSocket();
		
		byte[] buf = "你好,UDP send".getBytes();

		//创建数据，并打包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("USER-20161218VX"), 12345);
		//用Socket对象的发送方法，发送数据
		ds.send(dp);
		//释放资源
		ds.close();
	}

}
