import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetWorkingDemo {
	public static void main(String[]args) throws UnknownHostException {
		InetAddress address = InetAddress.getByName("localhost");
		System.out.println(address.getHostAddress()); 
	}
    
}
     