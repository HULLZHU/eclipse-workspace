import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircleWithMouseAndKey extends Application {

	public static void main(String [] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Circle circle = new Circle(100,100,100);
		Pane hbox = new Pane();
		Button btEnlarge = new Button("Enlarge");
		btEnlarge.setLayoutX(100);
		btEnlarge.setLayoutY(100);
		Button btShrink = new Button("Shrink");
		btShrink.setLayoutX(100);
		btShrink.setLayoutY(200);
		hbox.getChildren().add(btEnlarge);
		
		hbox.getChildren().add(btShrink);
		hbox.getChildren().add(circle);
		
		circle.setOnMouseDragged(e ->{
			circle.setCenterX(e.getX());
			circle.setCenterY(e.getY());
		});
		
		circle.setOnMouseClicked(e ->{
			circle.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		});
	
		btEnlarge.setOnAction(e ->{
			circle.setRadius(circle.getRadius() + 1);
		});
		
		btShrink.setOnAction(e->{
		  if (circle.getRadius() >1)
			circle.setRadius(circle.getRadius()-1);
		});
		
		circle.requestFocus();
		Scene scene = new Scene(hbox,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
