

import javafx.application.*;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.text.*;
public class StopSign extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Polygon polygon = new Polygon();
		pane.getChildren().add(polygon);
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.BLACK);
		//get a list of points
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT =200;
		double centerX  = WIDTH/2, centerY = HEIGHT/2;
		double radius = Math.min(WIDTH, HEIGHT)*0.4;
		
		//add x-coordinates and y-coordinates of points to Polygon instance
		for ( int i = 0; i < 6; i ++ ) {
			list.add(centerX +radius*Math.cos(2*i*Math.PI/6));
			list.add(centerY - radius*Math.sin(2*i*Math.PI/6));
		}
		
		Text text = new Text("STOP");
		text.setStrokeWidth(6);
		text.setFill(Color.WHITE);
		pane.getChildren().add(text);
		text.setFont(Font.font("Courier",FontWeight.BOLD,FontPosture.ITALIC,15));
		
		
		Scene scene = new Scene(pane, WIDTH, HEIGHT);
		primaryStage.setTitle("ShowPolygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main (String args[]) {
		launch(args);
	}
}