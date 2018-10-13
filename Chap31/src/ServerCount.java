import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ServerCount extends Application {
	private TextArea ta = new TextArea();
	private static int count = 0;
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScrollPane pane = new ScrollPane(ta);
		
		//run a thread
		Runnable myServerProcess = new MyServerProcess();
		Thread thread = new Thread(myServerProcess);
		thread.start();
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene); 
		primaryStage.show();
	} 

	
	class MyServerProcess implements Runnable{
	
		@Override
		public void run() {
			//first, we construct a Server Socket
			try {
			ServerSocket serverSocket = new ServerSocket(8000);
			Platform.runLater(() ->{
				ta.appendText("You successfully start up the server in "+ new Date());
			});
			while (true) {
				//now keep the serverSocket listening to the request and get a socket
				Socket socket = serverSocket.accept();
				Runnable controlSession = new ControlSession(socket);
				Thread thread = new Thread(controlSession);
				thread.start();
			}
			
			
			}
			catch (Exception ex) {
			}
			
		}
	}
	
	class ControlSession implements Runnable{
		private Socket socket;
		private DataOutputStream toClient;
		ControlSession (Socket socket){
			this.socket = socket;
		}
 
		@Override
		public void run() {
			
			try {
				
				InetAddress inetAddress = socket.getInetAddress();
				//update the GUI
				Platform.runLater(() ->{
					ta.appendText("The client "+count + " logged in, the IP address is "+ inetAddress.getHostAddress());
				});
				//control the stream
				toClient = new DataOutputStream(socket.getOutputStream());
				
				toClient.writeInt(count++);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
			
		}
	}
}
