import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsidePolygon extends Application {
	private Polygon polygon = new Polygon();
	private Pane pane = new Pane();
	private DoubleProperty x = new SimpleDoubleProperty();
	private DoubleProperty y = new SimpleDoubleProperty();
	private Text text = new Text();
	

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		pane.getChildren().add(polygon);
		pane.getChildren().add(text);
		
		//set polygon
		ObservableList list = polygon.getPoints();
		list.addAll(40.0,20.0,70.0,40.0,60.0,80.0,45.0,45.0,20.0,60.0);
		polygon.setFill(Color.RED);
		//set text 
		text.xProperty().bind(x);
		text.yProperty().bind(y);
		//set movement
		pane.setOnMouseMoved( e ->{
			x.set(e.getX());
			y.set(e.getY());
			
			if ( polygon.contains(e.getX(),e.getY())) {
				text.setText("Your Mouse is in the polygon");
			}
			else {
				text.setText("Your Mouse is not in polygon");
			}
		});
		//set stage
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
