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

public class BMIServer extends Application {
	
	TextArea ta = new TextArea();
	
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScrollPane pane= new ScrollPane(ta);
		Scene scene = new Scene(pane);
		Runnable serverProcess = new ServerProcess();
		Thread thread = new Thread(serverProcess);
		ta.setEditable(false);
		thread.start();
		primaryStage.setTitle("BMI Server");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	} 
	
	private class ServerProcess implements Runnable{
		private double weight;
		private double height;

		@Override
		public void run() {
			try { 
				//create serverSocket
				ServerSocket serverSocket = new ServerSocket(8001);
				ta.appendText("\n Start up the server at " + new Date());
				
				while (true) {
					//create socket and use while to keep listen
					Socket socket = serverSocket.accept();
					
					InetAddress inetAddress = socket.getInetAddress();
					System.out.println("The user "+ inetAddress.getHostName() + " at "+ new Date());
					//create input stream and output stream
					DataInputStream fromClient = new DataInputStream(socket.getInputStream());
					DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
					
					while (true) { 
						weight = fromClient.readDouble();
						height = fromClient.readDouble();
						double bmi = weight/height;
						toClient.writeDouble(bmi);
						//control the gui 
						Platform.runLater(()->{
							ta.appendText("\n Weight : "+ weight);
							ta.appendText("\n Height: "+ height);
							ta.appendText("\n BMI : "+bmi);
							ta.appendText("\n _____________");
						}); 
					}
				}
			} 
			catch (IOException ex) {
				ex.printStackTrace();
			}
			
		}
	}
	

}
