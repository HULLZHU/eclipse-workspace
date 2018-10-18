
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FindGrades extends Application{
	

	private TextField tfSSN = new TextField();
	private TextArea taResult = new TextArea();
	private Label lblRecord = new Label();
	private Statement stmt;
	public static void main(String[]args) {
		launch(args); 
	}
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		//
		initializeDB();
		//set the top pane
		Label lblSSN = new Label("SSN ",tfSSN);
		lblSSN.setContentDisplay(ContentDisplay.RIGHT);
		Button btShow = new Button("Show Grade");
		btShow.setOnAction(new ShowHandler()); 
		HBox hbox = new HBox(20);
		hbox.getChildren().addAll(lblSSN,btShow);
		//set the center pane
		ScrollPane scrollPane = new ScrollPane(taResult);
		//make pane done
		BorderPane pane = new BorderPane();
		pane.setTop(hbox);
		pane.setCenter(scrollPane);
		pane.setBottom(lblRecord);
		//scene and stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}
   
	private void initializeDB() throws ClassNotFoundException, SQLException {
		Class.forName(ScottJDBC.ForName);
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
		lblRecord.setText("Successfully Connected to the DB");
		stmt = connection.createStatement();
	} 
	
	public class ShowHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			try {
				String ssn = tfSSN.getText();
				ResultSet rsSet = stmt.executeQuery(" SELECT firstName, title, grade FROM Enrollment, Student, Course WHERE Enrollment.ssn=Student.ssn "
						+ "AND Course.courseId = Enrollment.courseId AND Student.ssn = "+ssn);
				
				while(rsSet.next()) {
					String firstName = rsSet.getString(1); 
					String title = rsSet.getString(2);
					String grade = rsSet.getString(3);
					taResult.appendText(firstName + " 's grade on course "+ title+" is "+ grade+"\n"); 
					 
				}
			}  
			catch(Exception ex) { 
				lblRecord.setText("Please make sure you input valid ssn");
			}
		}

	}
	
	
 
}
