package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	
	public static void main(String[] args) throws UnknownHostException {
		//public static InetAddress getByName(String host)
		//InetAddress address = InetAddress.getByName("USER-20161218VX");
		
		InetAddress address = InetAddress.getByName("192.168.56.1");
		
		//public String getHostAddress()
		String ip = address.getHostAddress();
		//public String getHostName()
		String hostname = address.getHostName();
		
		System.out.println(ip+"======"+hostname);
	}

}
