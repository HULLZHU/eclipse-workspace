import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class FindGradeUsingPreparedStatement extends Application{
	private PreparedStatement preparedStatement;
	private TextField tfSSN = new TextField();
	private TextField tfCourseId = new TextField();
	private Button btSubmit = new Button("Submit");
	private Label lblGrade = new Label();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initializeDB();
		//set hBox
		HBox hBox = new HBox(5);
		hBox.getChildren().addAll(new Label("SSN"),tfSSN,new Label("Course ID"),tfCourseId,btSubmit);
		VBox vbox = new VBox(5);
		vbox.getChildren().addAll(hBox,lblGrade);
		vbox.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);
		primaryStage.show();
		btSubmit.setOnAction(e->showGrade());
		
		 
	}

	private void initializeDB() {
		try {
			Class.forName(ScottJDBC.ForName); 
			System.out.println("Database Loaded");
			
			Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,"scott","123456");
			System.out.println("Database Connected");
			
			String queryString = "SELECT Enrollment.grade FROM Enrollment WHERE Enrollment.ssn = ? and Enrollment.courseId = ?";
			preparedStatement = connection.prepareStatement(queryString);
			
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}
	
	private void showGrade() {
		String ssn = tfSSN.getText();
		String courseId =tfCourseId.getText();
		try {
			preparedStatement.setString(1, ssn);
			preparedStatement.setString(2, courseId);
			ResultSet rset = preparedStatement.executeQuery();
			if ( rset.next() ) {
				String grade = rset.getString(1);
				lblGrade.setText("Your grade is "+grade);
			}
		}
		catch(SQLException ex) {
			System.out.println("Please make sure your information is right");
		}
	}

}
