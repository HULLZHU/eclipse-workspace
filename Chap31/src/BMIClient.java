import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BMIClient  extends  Application{
	private TextField tfWeight = new TextField();
	private TextField tfHeight = new TextField();
	private TextArea ta = new TextArea();
	private Button btSubmit = new Button("Submit");
	private Socket socket;
	
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScrollPane scrollPane = new ScrollPane(ta);
		GridPane gridPane = new GridPane();
		BorderPane pane = new BorderPane();
		
		gridPane.add(new Label("Weight"), 0, 0);
		gridPane.add(tfWeight, 1, 0); 
		gridPane.add(new Label("Height"), 0, 1);
		gridPane.add(tfHeight, 1, 1);
		gridPane.add(btSubmit,2, 1);
		
		pane.setTop(gridPane);
		pane.setBottom(scrollPane);
		socket = new Socket("localhost",8001); 
		
		btSubmit.setOnAction( e->{
			Runnable clientProcess = new ClientProcess();
			Thread thread = new Thread(clientProcess);
			thread.start();
		}); 
		 
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("BMI Client");
		primaryStage.show();

	} 
	
	private class ClientProcess implements Runnable{
		DataInputStream fromServer;
		DataOutputStream toServer;
		private double bmi; 
		@Override
		public void run() {
			try {
				
				fromServer = new DataInputStream(socket.getInputStream());
				toServer = new DataOutputStream(socket.getOutputStream());
				System.out.println("You successfully log into the server");
				toServer.writeDouble(Double.parseDouble(tfWeight.getText()));
				toServer.writeDouble(Double.parseDouble(tfHeight.getText()));
				bmi = fromServer.readDouble();
				
				Platform.runLater(() ->{
					ta.appendText("\n " + bmi);					
					});
				
				 
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
			
		}
		
	}

}
