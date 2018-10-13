import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class StudentServer {
	private ObjectOutputStream outputToFile;
	private ObjectInputStream inputFromClient;
	
	public static void main(String[]args) {
		new StudentServer();
	} 
	
	public StudentServer() {
		try {
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server Socket At "+ new Date());
			
			outputToFile  =  new ObjectOutputStream(new FileOutputStream("student.dat",true));
			
			while ( true ) {
				Socket socket =  serverSocket.accept();
				inputFromClient = new ObjectInputStream(socket.getInputStream());
				Object object = inputFromClient.readObject();
				
				//write object to the file
				outputToFile.writeObject(object);
				System.out.println("A new Student's information is stored");
				
				
			} 
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			try { 
				inputFromClient.close();
				outputToFile.close();
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
		
		
	}

}
