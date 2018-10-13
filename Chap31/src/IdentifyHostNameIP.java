import java.net.*;
public class IdentifyHostNameIP {
	public static void main(String[]args) {
		try {
			InetAddress address = InetAddress.getByName("www.baidu.com");
			System.out.println("Host Name : "+ address.getHostName());
			System.out.println("IP Address : "+ address.getHostAddress());
		}
		catch (UnknownHostException ex) {
			System.err.println("Unknown host or IP address ");
		}
	}

}
   