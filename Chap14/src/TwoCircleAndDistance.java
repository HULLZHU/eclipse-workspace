import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoCircleAndDistance extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Circle circle1 = new Circle(150*Math.random(),150*Math.random(),15);
		Circle circle2 = new Circle(150*Math.random(),150*Math.random(),15);
		
		Line line = new Line(circle1.getCenterX(),circle1.getCenterY(),circle2.getCenterX(),circle2.getCenterY());
		double distance = getDistance(circle1.getCenterX(),circle1.getCenterY(),circle2.getCenterX(),circle2.getCenterY());
		Text text2 = new Text(0.5*(circle1.getCenterX()+circle2.getCenterX()),0.5*(circle1.getCenterY()+circle2.getCenterY()),((int)distance*100)/100+"");
				
		pane.getChildren().addAll(circle1,circle2,line,text2);
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public double getDistance(double centerX, double centerY, double centerX2, double centerY2) {
		// TODO Auto-generated method stub
		return Math.sqrt((centerX-centerX2)*(centerX-centerX2)+(centerY-centerY2)*(centerY-centerY2));
	}
}
