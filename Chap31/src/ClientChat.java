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

public class ClientChat extends Application {
	
	private TextArea taServer = new TextArea();
	private TextArea taClient = new TextArea(); 
	private TextField txServer = new TextField();
	private TextField txClient = new TextField();
	private Socket socket ;
	@Override
	public void start(Stage primaryStage) throws Exception {
		taServer.setEditable(false);
		taClient.setEditable(false);
		
		txServer.setEditable(false);
		
		GridPane gridPane = new GridPane();
		ScrollPane serverPane = new ScrollPane(taServer);
		ScrollPane clientPane = new ScrollPane(taClient); 
		
		gridPane.add(new Label("Server"), 0, 0);
		gridPane.add(serverPane, 0, 1);
		gridPane.add(txServer, 0, 2); 
		
		gridPane.add(new Label("Client"), 0, 3);
		
		gridPane.add(clientPane, 0, 4);
		gridPane.add(txClient, 0, 5);
		
		  
		socket = new Socket("localhost",9000); 
		txClient.setOnAction(e ->{ 
			String text = txClient.getText();
			taServer.appendText("\nClient:\n" + text+"\n");
			taClient.appendText("\nClient:\n"+text+"\n");
			txClient.clear();
			try {
				new ObjectOutputStream(socket.getOutputStream()).writeObject(text);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				System.out.println("No connected now");
			}
		 
		}); 
		
		new Thread(new Communication()).start();
		
		Scene scene = new Scene(gridPane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ClientChat");
		primaryStage.show(); 
}  
	
	private class Communication implements Runnable{
 
		
		@Override
		public void run() {
			while (true) {
				try {
					ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());
					String text = (String) fromServer.readObject();
					taServer.appendText("\nServer:"+"\n"+text); 
					taClient.appendText("\nServer:\n"+ text);			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (Exception ex) {
					System.out.println("_____");
				}
			}
		}
	}
	
	public static void main(String[]args) {
		launch(args);
	}
}