import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideCircle extends Application{
	//define variables
	private Pane pane = new Pane();
	private Text text = new Text();
	Scene scene = new Scene(pane,500,500);
	private Circle circle = new Circle(50);
	private DoubleProperty textX = new SimpleDoubleProperty();
	private DoubleProperty textY = new SimpleDoubleProperty();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//initialize variables
		circle.setCenterX(scene.getWidth()/2);
		circle.setCenterY(scene.getHeight()/2);
		pane.getChildren().add(circle);
		pane.getChildren().add(text);
		pane.setFocusTraversable(true);
		circle.setFill(Color.YELLOW);
		text.xProperty().bind(textX);
		text.yProperty().bind(textY);
		
		//set movement within the pane
		pane.setOnMouseMoved( e->{
			if ( circle.contains(e.getX(), e.getY())) 
				text.setText("Mouse is inside the circle.");
			else
				text.setText("Mouse is not inside the circle");
			textX.set(e.getX());
			textY.set(e.getY());
		});
		
		
		//show 
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
