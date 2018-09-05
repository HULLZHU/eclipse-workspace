import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MovingRectangle extends Application{
	private Rectangle rec = new Rectangle(100,100,100,100);
	private DoubleProperty centerX = new SimpleDoubleProperty();
	private DoubleProperty centerY = new SimpleDoubleProperty();
	private Pane pane = new Pane();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		rec.setFill(Color.WHITE);
		rec.setStroke(Color.BLACK);
		rec.xProperty().bind(centerX.subtract(rec.widthProperty().divide(2)));
		rec.yProperty().bind(centerY.subtract(rec.heightProperty().divide(2)));
		
		rec.setOnMouseDragged( e ->{
			centerX.set(e.getX());
			centerY.set(e.getY());
		});
		
		pane.getChildren().add(rec);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
