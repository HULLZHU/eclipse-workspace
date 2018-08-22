import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class Cylinder extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Ellipse ellipse1 = new Ellipse(200,200,80,40);
		ellipse1.setFill(Color.WHITE);
		ellipse1.setStroke(Color.BLACK);
		Arc upperArc = new Arc(200,400,80,40,0,180);
		Arc lowerArc = new Arc(200,400,80,40,0,-180);
		upperArc.setType(ArcType.OPEN);
		lowerArc.setType(ArcType.OPEN);
		upperArc.setFill(Color.WHITE);
		lowerArc.setFill(Color.WHITE);
		upperArc.setStroke(Color.BLUE);
		lowerArc.setStroke(Color.BLACK);
		upperArc.setOpacity(0.3);
		upperArc.getStrokeDashArray().addAll(6.0,21.0);
		
		Line line1 = new Line(120,200,120,400);
		Line line2 = new Line(280,200,280,400);
		
		pane.getChildren().addAll(upperArc,lowerArc,ellipse1,line1,line2);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}