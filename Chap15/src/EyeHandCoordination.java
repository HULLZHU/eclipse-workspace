import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EyeHandCoordination extends Application {
	private Pane pane = new Pane();
	private Circle circle1 = new Circle(10);
	private Circle circle2 = new Circle(10);
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		long startTime = System.currentTimeMillis();
		circle1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		pane.getChildren().add(circle1);
		circle1.setCenterX(200*Math.random());
		circle1.setCenterY(200*Math.random());
		
		circle1.setOnMouseClicked( e->{
			pane.getChildren().clear();
			pane.getChildren().add(circle2);
			circle2.setCenterX(200*Math.random());
			circle2.setCenterY(200*Math.random());
		});
		
		circle2.setOnMouseClicked( e->{
			pane.getChildren().clear();
			Text text = new Text();
			long endTime = System.currentTimeMillis();
			text.setText("The Time Spend IS "+(endTime-startTime)+" MilliSeconds");
			pane.getChildren().add(text);
			text.setX(100);
			text.setY(100);
		});
		
		Scene scene = new Scene(pane,400,400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
