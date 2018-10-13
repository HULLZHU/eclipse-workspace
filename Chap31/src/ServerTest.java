import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
public class ServerTest extends Application {
	TextArea ta = new TextArea();
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Scene scene = new Scene(new ScrollPane(ta),450,200);
		
		primaryStage.setTitle("Server");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Thread serverThread = new Thread(new ServerActivity());
		serverThread.start();
		
	}
	
	class ServerActivity implements Runnable{

		@Override
		public void run() {
			try {
				//create a server socket
				ServerSocket serverSocket = new ServerSocket(8000);
				Platform.runLater(()->{
					ta.appendText("Server Started at "+ new Date());
				});
				//listen for a connection request
				Socket socket =serverSocket.accept();
				// create DataInput and DataOutput
				DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
				DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
				 
				while (true){
					// receive the radius from client 
					double radius = inputFromClient.readDouble();
					 
					//compute area
					double area = radius * radius *Math.PI;
					
					//send area back to the client
					outputToClient.writeDouble(area);
		
					Platform.runLater(()->{
						ta.appendText("Radius received from client: "+ radius + '\n');
						ta.appendText("Area is : "+ area +'\n');
					});	
					
					InetAddress inetAddress = socket.getInetAddress();
					System.out.println("The client host name is "+ inetAddress.getHostName() );
					System.out.println("The client host address is " + inetAddress.getHostAddress());
				} 
			}
			catch (IOException ex) {
				ex.printStackTrace(); 
			} 
		}
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}
