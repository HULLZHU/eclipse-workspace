import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		Circle circle = new Circle();
		circle.centerXProperty().bind(pane.widthProperty().divide(3));
		circle.centerYProperty().bind(pane.heightProperty().divide(3));
		circle.setRadius(50);
		circle.setStroke(Color.ORANGE);
		circle.setFill(Color.GREENYELLOW);
		pane.getChildren().add(circle);
		
		Scene scene = new Scene(pane,500,500);
		primaryStage.setTitle("Show Binding Circle");
		primaryStage.setScene(scene);
		primaryStage.setHeight(1000);
		primaryStage.show();
	}
	
	public static void main (String args[]) {
		launch(args);
	}
	

}
