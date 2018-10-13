import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
public class MultipleBondValuationServer extends Application{
	private double annualIR;
	private double numberOfYear;
	private double parValue;
	private double currentValue;
	private TextArea ta = new TextArea();
	private static int clientNo = 0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScrollPane scrollPane = new ScrollPane(ta);
		Scene scene = new Scene(scrollPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Multiple Client Server for Bond Valuation");
		Runnable myServerProcess = new MyServerProcess();
		Thread thread = new Thread(myServerProcess);
		thread.start();
		 
		primaryStage.show();
	}
	 
	private class MyServerProcess implements Runnable{

		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(8000);
				ta.setText("Server started up at "+ new Date());
				while (true) {
					Socket socket = serverSocket.accept();
					clientNo ++ ;
					System.out.println("The client "+ clientNo +" logged in");
					
					Runnable mySession = new MySession(socket);
					Thread thread = new Thread(mySession);
					thread.run();
				}
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}
	
	private class MySession implements Runnable{
		private Socket socket;
		private DataInputStream fromClient;
		private DataOutputStream toClient ;

		MySession (Socket socket){
			this.socket= socket;
		}
		
		@Override
		public void run() {
			try {
				DataInputStream fromClient = new DataInputStream(socket.getInputStream());
				DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
				while(true) {
				annualIR = fromClient.readDouble();
				numberOfYear = fromClient.readDouble();
				parValue = fromClient.readDouble();
				currentValue = parValue/(Math.pow(1+annualIR, numberOfYear));
				
				toClient.writeDouble(currentValue);
				
				Platform.runLater(() ->{
					ta.appendText("\nThe annualIR is "+ annualIR);
					ta.appendText("\nThe Number of Year is "+ numberOfYear);
					ta.appendText("\nThe par value is "+parValue);
					ta.appendText("\nThe current value is "+ currentValue);
					ta.appendText("\n_________________________________");
				});
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
	}

}
