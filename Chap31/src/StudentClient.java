import java.io.ObjectOutputStream;
import java.net.Socket;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentClient extends Application{
	private TextField tfName = new TextField();
	private TextField tfStreet = new TextField();
	private TextField tfCity = new TextField();
	private TextField tfState = new TextField();
	private TextField tfZip = new TextField();
	private Button btRegister = new Button("Register");
	private String host =  "localhost";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.add(new Label("name"), 0, 0);
		pane.add(tfName, 1, 0);
		pane.add(new Label("Street"), 0, 1);
		pane.add(tfStreet, 1, 1);
		pane.add(new Label("City"), 0, 2);
		pane.add(tfCity, 1, 2);
		pane.add(new Label("State"), 0, 3);
		pane.add(tfState, 1, 3);
		pane.add(new Label("Zip"), 0, 4);
		pane.add(tfZip,1,4);
		pane.add(btRegister, 0, 5);
		 
		pane.setAlignment(Pos.CENTER);
		tfName.setPrefColumnCount(15);
		tfStreet.setPrefColumnCount(15);
		tfCity.setPrefColumnCount(10);
		tfState.setPrefColumnCount(2);
		tfZip.setPrefColumnCount(3);
		
		btRegister.setOnAction( new ButtonListener());
		
		
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		 
	}
	
	public static void main(String[]args) {
		launch(args);
	}
	
	private class ButtonListener implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			try {
				//establish connection with the server
				Socket socket = new Socket(host,8000);
				
				//create an output stream to the server
				ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
				
				//get TextField
				String name = tfName.getText().trim();
				String street = tfStreet.getText().trim();
				String city = tfCity.getText().trim();
				String  state = tfState.getText().trim();
				String zip = tfZip.getText().trim();
				
				StudentAddress s = new StudentAddress(name,street,city,state,zip);
				toServer.writeObject(s);
			}
			
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
 
}
