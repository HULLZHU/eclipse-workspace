import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BondValuationClient extends Application{
	//define some global variables
	private TextField tfAnnualIR = new TextField();
	private TextField tfNumberOfYear = new TextField();
	private TextField tfParValue = new TextField();
	private Button btSubmit = new Button("Submit");
	private TextArea  ta = new TextArea();
	private Socket socket ;
	  
	@Override 
	public void start(Stage primaryStage) throws Exception {
		GridPane gridPane = new GridPane(); 
		gridPane.add(new Label("Annual Interest Rate"), 0, 0);
		gridPane.add(tfAnnualIR, 1, 0);
		gridPane.add(new Label("Number Of Year"), 0, 1);
		gridPane.add(tfNumberOfYear, 1, 1);
		gridPane.add(new Label("Par Value"),0,2);
		gridPane.add(tfParValue, 1, 2);
		gridPane.add(btSubmit, 2, 2); 
		
		BorderPane pane = new BorderPane();
		pane.setTop(gridPane);
		pane.setBottom(new ScrollPane(ta)); 
		pane.setPrefSize(450, 300);
		
		btSubmit.setOnAction( new SubmitAction()); 
		 socket = new Socket("localhost",8000);
		 
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private class SubmitAction implements EventHandler<ActionEvent>{
		DataOutputStream toServer ;
		DataInputStream fromServer;
 
		@Override
		public void handle(ActionEvent e) {
			try {   
				System.out.println("Successfully connected to the server ");
				fromServer = new DataInputStream(socket.getInputStream()); 
				toServer = new DataOutputStream(socket.getOutputStream());
				double annualIR = Double.parseDouble(tfAnnualIR.getText());
			    double numberOfYear = Double.parseDouble(tfNumberOfYear.getText());
				double parValue= Double.parseDouble(tfParValue.getText());
				toServer.writeDouble(annualIR);
				toServer.writeDouble(numberOfYear);
				toServer.writeDouble(parValue);
				double currentValue = fromServer.readDouble(); 
				ta.appendText("The current value is "+ currentValue +"\n");
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
