import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveCircle extends Application{
	private Circle circle = new Circle(20);
	private DoubleProperty centerX = new SimpleDoubleProperty();
	private DoubleProperty centerY = new SimpleDoubleProperty();
	private Pane pane = new Pane();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().add(circle);
		Scene scene = new Scene(pane,500,500);
		
		circle.setFill(Color.YELLOW);
		circle.centerXProperty().bind(centerX);
		circle.centerYProperty().bind(centerY);
		
		centerX.set(scene.getWidth()/2);
		centerY.set(scene.getHeight()/2);
		
		circle.setFocusTraversable(true);
		circle.setOnKeyPressed( e->{
			if (e.getCode() == KeyCode.UP) 
				centerY.set(centerY.get()-10);
			else if (e.getCode() ==KeyCode.DOWN)
				centerY.set(centerY.get() + 10);
			else if (e.getCode() == KeyCode.LEFT)
				centerX.set(centerX.get() - 10);
			else if ( e.getCode() == KeyCode.RIGHT)
				centerX.set(centerX.get() + 10);
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
