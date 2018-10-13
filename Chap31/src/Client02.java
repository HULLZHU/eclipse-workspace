import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Client02 extends Application {
	//IO Stream
	DataOutputStream toServer = null;
	DataInputStream fromServer = null;

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create a pane to hold labels and text field
		BorderPane paneForTextField = new BorderPane();
		paneForTextField.setPadding(new Insets(5,5,5,5));
		paneForTextField.setStyle("-fx-border-color:green");
		paneForTextField.setLeft(new Label("Enter a radius"));
		
		TextField tf = new TextField();
		tf.setAlignment(Pos.BOTTOM_RIGHT);
		paneForTextField.setCenter(tf);
		
		BorderPane mainPane = new BorderPane();
		//TextArea to display contents 
		TextArea ta = new TextArea();
		mainPane.setCenter(new ScrollPane(ta));
		mainPane.setTop(paneForTextField);
		
		//create a scene and place it in the scene
		Scene scene = new Scene(mainPane,450,200);
		primaryStage.setTitle("Client");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		tf.setOnAction( e->{
			try {
				//get the radius from the textfield
				double radius = Double.parseDouble(tf.getText().trim());
				
				//send radius to the server
				toServer.writeDouble(radius);
				toServer.flush();
				
				//get the area from the server
				double area = fromServer.readDouble();
				
				ta.appendText("Radius is "+ radius + " \n" );
				ta.appendText("Area is  "+ area + " \n");
			}
			catch(IOException ex) {
				ex.printStackTrace();
			} 
		});  
		   
		try { 
			//create a socket to the server
			Socket socket = new Socket("localhost",8001);
			//Socket socket = new Socket("130.254.204.36",8000);
			//create an inputStream to receive data from the server
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
		}
		catch (IOException ex) { 
			
			ta.appendText(ex.toString() + "\n");
		}
		 
	}

	public static void main(String[] args) {
		launch(args);
	}
}