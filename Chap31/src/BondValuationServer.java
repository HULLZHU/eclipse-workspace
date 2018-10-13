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

public class BondValuationServer extends Application {
	private double annualIR;
	private double numberOfYear;
	private double parValue;  
	private double currentValue;
	private TextArea ta = new TextArea();
	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new ScrollPane(ta),450,250);
		Runnable serverProcess= new MyServerProcess();
		Thread thread = new Thread(serverProcess);
		thread.start();
		primaryStage.setScene(scene);
		primaryStage.setTitle("Bond Valuation Server");
		primaryStage.show();
		
	}
	 
	class MyServerProcess implements Runnable{

		@Override
		public void run() { 
			try {
				ServerSocket serverSocket = new ServerSocket(8000);
				ta.appendText("The server started at " + new Date());
				 
				while (true) { 
					//listen for a new connection request
					Socket socket = serverSocket.accept(); 
					
					InetAddress inetAddress = socket.getInetAddress();
					System.out.println(new Date()+" : The user "+inetAddress.getHostName() + " logged in");
					 
					//create DataoutputStream and DataInputStream
					DataInputStream fromClient = new DataInputStream(socket.getInputStream());
					DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
					 
					//keep stream 
					while (true) {
						//get value from input stream
						annualIR = fromClient.readDouble();
						numberOfYear = fromClient.readDouble();
						parValue = fromClient.readDouble();
						//compute the currentValue
						currentValue = parValue/(Math.pow(1+annualIR, numberOfYear));
						//output the value 
						toClient.writeDouble(currentValue);
						
						Platform.runLater(() ->{
							ta.appendText("\nThe annualIR is "+ annualIR);
							ta.appendText("\nThe Number of Year is "+ numberOfYear);
							ta.appendText("\nThe par value is "+parValue);
							ta.appendText("\nThe current value is "+ currentValue);
							ta.appendText("\n_________________________________");
						});
					}
					 
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
