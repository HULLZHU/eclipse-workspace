import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class VisualizeData extends Application{

	private Statement stmt;
	private int sumOfStudents;
	private ArrayList<String> listOfDeptId = new ArrayList<>();
	private ArrayList<Double> counts = new ArrayList<>();
	public static void main(String[] args) {
		launch(args);
	} 

	@Override
	public void start(Stage primaryStage) throws Exception {
		initializeDB();
		BorderPane pane = new BorderPane();
		pane.setLeft(new BarPane(10));
		pane.setRight(new Pie());
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show(); 
		
	}

	private void initializeDB() throws ClassNotFoundException, SQLException {
		//Load driver
		Class.forName(ScottJDBC.ForName);
		System.out.println("The Driver is loaded");
		
		//Get Connection 
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,"123456");
		System.out.println("The DB is Connected");
		
		stmt = connection.createStatement(); 
		updateDepartmentList(); 
		drawPieAndBar();
	}
	
	

	private void drawPieAndBar() {
		
		
	}

	private void updateDepartmentList() throws SQLException {  
		//first update the count of department
		ResultSet rsSet = stmt.executeQuery("SELECT deptId,count(deptId) FROM Student GROUP BY deptId");
		while (rsSet.next()) {
			//get the value from DB
			String deptId = rsSet.getString(1);
			double countOfStudents = Double.parseDouble(rsSet.getString(2));
			listOfDeptId.add(deptId);
			counts.add(countOfStudents);
			sumOfStudents += countOfStudents;
		} 
		
		for ( int i = 0 ; i < counts.size(); i ++ ) {
			counts.set(i, counts.get(i)/sumOfStudents);
		}
		
	 
	}

	private class Pie extends Pane{ 
		private double radius = 100; 
		private double startAngle = 0;
		
		Pie(){
			for ( int i = 0 ; i < counts.size(); i ++ ) {
				double length = counts.get(i)*360; 
				Arc arc = new Arc();
				arc.setRadiusX(radius);
				arc.setRadiusY(radius);
				arc.setStartAngle(0);
				arc.setCenterX(120);
				arc.setCenterY(120);
				arc.setStartAngle(startAngle);
				arc.setLength(length);
				this.getChildren().add(arc);
				arc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				arc.setType(ArcType.ROUND);
				startAngle += length; 
				
				Label lblDeptId = new Label(listOfDeptId.get(i));
				double x = arc.getCenterX() + 1.1*arc.getRadiusX()*Math.cos(Math.toRadians(startAngle-0.5*length));
				double y = arc.getCenterY() - 1.1*arc.getRadiusX()*Math.sin(Math.toRadians(startAngle-0.5*length));  
				lblDeptId.setLayoutX(x);  
				lblDeptId.setLayoutY(y);   
				this.getChildren().add(lblDeptId);    
			}   
		} 
	} 
	
	private class BarPane extends HBox{
		private double totalHeight = 500;
		BarPane( int gap){
			super(gap);
			this.setAlignment(Pos.BOTTOM_CENTER);
			addBars();
		}
		
		private void addBars() {
			 
			for ( int i = 0 ;i < counts.size() ; i ++ ) {
				Rectangle rec = new Rectangle();
				rec.setWidth(30);
				rec.setHeight(totalHeight*counts.get(i));
				rec.setFill(Color.color(Math.random(), Math.random(), Math.random()));
				Label lblRec = new Label(listOfDeptId.get(i),rec);
				lblRec.setContentDisplay(ContentDisplay.BOTTOM);
				this.getChildren().add(lblRec);
			}
			
		} 
	} 

}