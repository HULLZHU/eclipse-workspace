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

public class MultithreadServer extends Application {
	//Text Area for displaying contents
	private TextArea ta =new TextArea();
	//Number a client
	private int clientNo = 0;

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create a scene and place it the stage 
		Scene scene = new Scene(new ScrollPane(ta),450,200);
		primaryStage.setTitle("MultiThreadServer");
		primaryStage.setScene(scene);
		primaryStage.show();	
		Thread serverThread = new Thread(new MyServer());
		serverThread.run();
		
	} 
	
	private class MyServer implements Runnable{
  
		@Override
		public void run() { 
			try { 
				//create a server socket
				ServerSocket serverSocket = new ServerSocket(8001);
				ta.appendText("MultiThreadServer started at "+ new Date()+'\n');
				 
				while (true) {
					// listen for a new connection request
					Socket socket = serverSocket.accept();
					//increment clientNo
					clientNo++;
					
					Platform.runLater(()-> {
						ta.appendText("Starting Thread for clent "+clientNo+" at "+new Date()+'\n');
						//find the client's host name and IP address
						InetAddress inetAddress = socket.getInetAddress();
						ta.appendText("Client "+clientNo + " 's host name is " + inetAddress.getHostName()+'\n');
					});
					
					//create and start a new thread for the connection;
					new Thread(new HandleAClient(socket)).start();
				}
			}
			catch(IOException ex) {
				System.err.println(ex);
			}
			
		}
		
	}
	
	class HandleAClient implements Runnable{
		private Socket socket; 
		
		HandleAClient(Socket socket){
			this.socket = socket;
		}
		 
		@Override
		public void run() {
			try {
				DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
				DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
				
				while (true) {
					double radius = inputFromClient.readDouble();
					double area = radius * radius *Math.PI;
					
					outputToClient.writeDouble(area);
					
					Platform.runLater(()->{
						ta.appendText("radius received from client : "+ radius+'\n');
						ta.appendText("Area" + area +'\n');
					});
				}
			}catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	} 
	
	public static void main(String[]args) {
		launch(args);
	}
 
}
