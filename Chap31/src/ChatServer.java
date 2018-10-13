import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChatServer extends Application {
	
	
	private TextArea taServer = new TextArea();
	private TextArea taClient = new TextArea();
	private TextField txServer = new TextField();
	private TextField txClient = new TextField();
	private Socket socket ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		taServer.setEditable(false);
		taClient.setEditable(false); 
		txClient.setEditable(false);
		
		GridPane gridPane = new GridPane();
		ScrollPane serverPane = new ScrollPane(taServer);
		ScrollPane clientPane = new ScrollPane(taClient); 
		
		gridPane.add(new Label("Server"), 0, 0);
		gridPane.add(serverPane, 0, 1);
		gridPane.add(txServer, 0, 2); 
		
		gridPane.add(new Label("Client"), 0, 3);
		gridPane.add(clientPane, 0, 4);
		gridPane.add(txClient, 0, 5);
		 
		//socket = new Socket("localhost",8000);
		
		new Thread(new ServerProcessor()).start();
		
		txServer.setOnAction(e ->{ 
			String text = txServer.getText();
			taServer.appendText("Server:\n" + text+"\n"); 
			taClient.appendText("Server:\n"+text+"\n");
			txServer.clear();
			try {
				new ObjectOutputStream(socket.getOutputStream()).writeObject(text);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("No connected now");
			}
		 
		}); 
		
		Scene scene = new Scene(gridPane);
		primaryStage.setTitle("ChatServer");
		primaryStage.setScene(scene);
		primaryStage.show(); 
				 
}
	
	private class Communication implements Runnable{

		@Override
		public void run() {
			while (true) {
				try {
					ObjectInputStream fromClient = new ObjectInputStream(socket.getInputStream());
					String text = (String) fromClient.readObject();
					taServer.appendText("\nClient:"+"\n"+text); 
					taClient.appendText("\nClient:\n"+ text);			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	private class ServerProcessor implements Runnable{

		@Override
		public void run() {
			try {
				ServerSocket serverSocket = new ServerSocket(9000);
				while (true) {
					socket = serverSocket.accept();
					new Thread(new Communication()).start();
				}
			}
			catch (Exception ex) {
				ex.printStackTrace();
			} 	
		}
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}