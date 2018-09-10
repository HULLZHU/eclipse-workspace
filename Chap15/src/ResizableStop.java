import javafx.application.Application;
import javafx.beans.binding.DoubleExpression;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ResizableStop extends Application {
	private Pane pane = new Pane();
	private Circle circle = new Circle();
	private Text text = new Text("STOP");
	public static void main(String[] args) {
		launch(args);	
		}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(pane,1000,1000);
		primaryStage.setScene(scene);
		//set Layout
		pane.getChildren().addAll(circle,text);
		//bind properties
		circle.radiusProperty().bind(min(scene.heightProperty(),scene.widthProperty()).divide(3));
		circle.centerXProperty().bind(scene.xProperty().add(scene.widthProperty().divide(2)));
		circle.centerYProperty().bind(scene.yProperty().add(scene.heightProperty().divide(2)));
		text.xProperty().bind(circle.centerXProperty());
		text.yProperty().bind(circle.centerYProperty());
		//set Circle
		DoubleProperty size = new SimpleDoubleProperty();
		size.bind(circle.radiusProperty().subtract(10));
		System.out.println(text.textProperty());
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
	}

	private DoubleExpression min(ReadOnlyDoubleProperty heightProperty, ReadOnlyDoubleProperty widthProperty) {
		if (heightProperty.get()< widthProperty.get()) {
			return heightProperty;
		}
		return 
				widthProperty;

	}
	

}
