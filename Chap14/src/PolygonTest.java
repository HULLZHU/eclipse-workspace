import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class PolygonTest extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Polyline polygon = new Polyline ();
		ObservableList<Double> list = polygon.getPoints();
		list.addAll(20.0,40.0,30.0,50.0,40.0,90.0,90.0,10.0,10.0,30.0);
		
		Pane pane = new Pane();
		pane.getChildren().add(polygon);
		Scene scene = new Scene(pane);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	

}
