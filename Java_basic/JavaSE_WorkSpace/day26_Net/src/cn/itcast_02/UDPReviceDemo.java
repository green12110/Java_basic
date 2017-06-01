package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.activation.MailcapCommandMap;

/*
 *  UDPЭ���������
 * A:�������ն�Socket����
 * B:����һ�����ݰ�(��������)
 * C:����Socket����Ľ��շ�����������
 * D:�������ݰ�������ʾ�ڿ���̨
 * E:�ͷ���Դ
 * 
 * 
 */


public class UDPReviceDemo {
	
	public static void main(String[] args) throws IOException {
		//DatagramSocket(int port) �������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿ڡ�
		DatagramSocket ds = new DatagramSocket(10086);
		//DatagramPacket(byte[] buf, int length) �������ճ���Ϊ length �����ݰ�
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