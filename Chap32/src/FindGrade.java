import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class FindGrade extends Application {
	private Statement stmt;
	private TextField tfSSN = new TextField();
	private TextField tfCourseId = new TextField();
	private Label lblStatus = new Label();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//initialize the DB
		initializeDB();
		
		Button btShowGrade = new Button("Show Grade");
		HBox hbox = new HBox(5);
		hbox.getChildren().addAll(new Label("SSN"),tfSSN,new Label("Course ID"),tfCourseId,btShowGrade);
		
		VBox vBox = new VBox(10);
		vBox.getChildren().addAll(hbox,lblStatus);
		
		tfSSN.setPrefColumnCount(6);
		tfCourseId.setPrefColumnCount(6);
		btShowGrade.setOnAction(e -> showGrade());
		
		//create a scene and place it in the stage
		Scene scene = new Scene(vBox,420,80);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Find Title");
		primaryStage.show();
		
		
		
	}
 
	private void showGrade() { 
		String ssn = "'"+tfSSN.getText().trim()+"'";
		String courseId = "'"+tfCourseId.getText().trim()+"'";  
		try {
			String queryString = "SELECT Enrollment.grade, Course.CourseId FROM Student,Course,Enrollment WHERE Student.ssn = Enrollment.ssn and Student.ssn="+ssn + " and Course.courseId="+courseId; 
			
			ResultSet rset = stmt.executeQuery(queryString); 
			
			
			if ( rset.next() ) {  
				String grade = rset.getString(1);
				lblStatus.setText("Your grade is "+ grade);
			}
			else { 
				lblStatus.setText("Please double check you input a valid ssn or courseId");
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	private void initializeDB() {
		try { 
			//load the JDBC driver
			Class.forName(ScottJDBC.ForName);
			System.out.println("The driver loaded");
			
			//Establish a connection
			Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
			System.out.println("Database Connected");
		
			//create a statement      
			stmt = connection.createStatement();
		}
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	} 

}
