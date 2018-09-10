import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class BallAndCurve extends Application{
	private Polyline path = new Polyline();
	private Circle ball = new Circle(10);
	private Line verticalAxis = new Line();
	private Line horizontalAxis = new Line();
	private Pane pane = new Pane();
	private Scene scene = new Scene(pane,300,300);
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().addAll(path,verticalAxis,horizontalAxis,ball);
		//bind property
		verticalAxis.startXProperty().bind(scene.widthProperty().divide(2));
		verticalAxis.setStartY(10);
		verticalAxis.endXProperty().bind(scene.widthProperty().divide(2));
		verticalAxis.endYProperty().bind(scene.heightProperty().subtract(10));
		
		horizontalAxis.startXProperty().bind(new SimpleDoubleProperty(10));
		horizontalAxis.startYProperty().bind(scene.heightProperty().divide(2));
		horizontalAxis.endXProperty().bind(scene.widthProperty().subtract(10));
		horizontalAxis.endYProperty().bind(horizontalAxis.startYProperty());
		
		ball.setCenterX(pane.getWidth()/2);
		ball.setCenterY(pane.getHeight()/2);
		ball.setFill(Color.YELLOW);
		
		//set path
		ObservableList<Double> list = path.getPoints();
		//SimpleDoubleProperty scaleFactor = new SimpleDoubleProperty();
		for (int x = -300; x <= 300; x ++) {
			list.add(x+scene.widthProperty().subtract(2).get());
			list.addAll(pane.heightProperty().get()-50*Math.sin(x/100.0)*2*Math.PI);
		}
		
		
		
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
