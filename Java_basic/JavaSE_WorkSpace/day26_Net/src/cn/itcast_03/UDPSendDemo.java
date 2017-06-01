package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
/*
 * UDPЭ�鷢�����ݣ�
 * A:�������Ͷ�Socket����
 * B:�������ݣ��������ݴ��
 * C:����Socket����ķ��ͷ����������ݰ�
 * D:�ͷ���Դ
 */
public class UDPSendDemo {
	
	public static void main(String[] args) throws IOException {
		// ����Socket����
		DatagramSocket ds = new DatagramSocket();
		
		byte[] buf = "���,UDP send".getBytes();

		//�������ݣ������
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("USER-20161218VX"), 12345);
		//��Socket����ķ��ͷ�������������
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
	}

}
