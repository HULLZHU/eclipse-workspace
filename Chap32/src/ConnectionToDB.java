import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.corba.se.pept.transport.Connection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class ConnectionToDB extends BorderPane{
	

	private Label lblRecord = new Label();
	private TextField tfDrive = new TextField();
	private TextField tfURL = new TextField();
	private TextField tfUserName = new TextField();
	private TextField tfPassWord = new TextField();
	
	ConnectionToDB(){
		initialize();
	}

	private void initialize() {
		//set the general layout
		this.setTop(lblRecord);
		GridPane gridPane = new GridPane();
		this.setCenter(gridPane);
		Button btConnect = new Button("Connect To DB");
		this.setBottom(btConnect);
		
		//set labels
		Label lblDrive = new Label("JDBC Driver",tfDrive);  
		tfDrive.setPrefColumnCount(30);
		lblDrive.setContentDisplay(ContentDisplay.RIGHT);  
		Label lblURL = new Label("Database URL",tfURL);
		tfURL.setPrefColumnCount(70);
		lblURL.setContentDisplay(ContentDisplay.RIGHT);
		 
		Label lblUsername = new Label("User Name",tfUserName);
		tfUserName.setPrefColumnCount(20);
		lblUsername.setContentDisplay(ContentDisplay.RIGHT); 
		
		Label lblPassword = new Label("Pass Word",tfPassWord);
		tfPassWord.setPrefColumnCount(20);
		lblPassword.setContentDisplay(ContentDisplay.RIGHT);
		
		//set the gridPane's Layout
		gridPane.add(lblDrive, 0, 1);
		gridPane.add( lblURL, 0, 2);
		gridPane.add(lblUsername, 0, 3); 
		gridPane.add(lblPassword, 0, 4);
		gridPane.setVgap(10);
		
		btConnect.setOnAction(e ->{
			try { 
				Class.forName(tfDrive.getText());
				java.sql.Connection connection = DriverManager.getConnection(tfURL.getText(), tfUserName.getText(), tfPassWord.getText());
				lblRecord.setText("Connected"); 
			} catch (ClassNotFoundException e1) {
				lblRecord.setText("Pleae Check Your JDBC Driver Name"); 
			} catch (SQLException e1) { 
				lblRecord.setText("Please Check Your URL, username, and password ");
			}
		});
	}
} 
