import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class RandomPointsOnCircle extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle circle = new Circle(200,200,150);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		double[] angles = new double[5];
		for ( int i =0; i < 5; i ++ ) {
			double angle = 360*Math.random();
			angles[i] = angle;
		}
		
		Arrays.sort(angles);
		Polygon polygon = new Polygon();
		polygon.setFill(Color.WHITE);
		polygon.setStroke(Color.BLACK);
		ObservableList list = polygon.getPoints();
		
		for ( int i = 0 ; i < 5; i ++ ) {
			double x = 200 + 150*Math.cos(Math.toRadians(angles[i]));
			double y = 200 - 150*Math.sin(Math.toRadians(angles[i]));
			list.addAll(x,y);
		}
		
		pane.getChildren().addAll(circle,polygon);
		primaryStage.setScene(new Scene(pane));
		primaryStage.show();
	}

}
