import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AddAndRemoveCircle extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		pane.setOnMouseClicked(e ->{
			Circle circle = new Circle();
			circle.setRadius(10);
			circle.setFill(Color.WHITE);
			circle.setStroke(Color.BLACK);
			circle.setCenterX(e.getX());
			circle.setCenterY(e.getY());
			pane.getChildren().add(circle);
			circle.setOnMouseEntered(ex ->{
				if (ex.isShiftDown()) {
					pane.getChildren().remove(circle);
				}
				
				if(ex.isControlDown()) {
					circle.setFill(Color.GREEN);
				}
			});
		
		});
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
