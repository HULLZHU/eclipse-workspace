import javafx.application.Application;
import javafx.collections.ObservableList;

import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class Smile extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create pane
		Pane pane = new Pane();
		//create triangle
		Polygon triangle = new Polygon(600,500,500,600,700,600);
	   //create circle
		Circle circle = new Circle(500,600,600);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		//create mouth
		Arc arc = new Arc(600,800,200,120,0,-180);
		arc.setFill(Color.WHITE);
		arc.setStroke(Color.RED);
		//create eye
		Circle inner1 = new Circle(700,300,50);
		Circle inner2 = new Circle(500,300,50);
		inner1.setFill(Color.YELLOW);
		inner2.setFill(Color.YELLOW);
		Ellipse outer1 = new Ellipse(800,300,150,120);
		Ellipse outer2 = new Ellipse(400,300,150,120);
		outer1.setFill(Color.WHITE);
		outer2.setFill(Color.WHITE);
		outer1.setStroke(Color.BLACK);
		outer2.setStroke(Color.BLACK);
		
		//add nodes to pane
		pane.getChildren().add(circle);
		pane.getChildren().add(triangle);
		pane.getChildren().add(arc);
		pane.getChildren().addAll(outer1,outer2,inner1,inner2);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}