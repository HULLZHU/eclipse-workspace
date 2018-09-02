import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideRectangle extends Application {
	//set variable
	private Rectangle rec = new Rectangle(50,40,100,60);
	private Pane pane = new Pane();
	private DoubleProperty x = new SimpleDoubleProperty();
	private DoubleProperty y = new SimpleDoubleProperty();
	private Text text = new Text("Your Mouse is not in Rectangle");
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//initialize stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		pane.getChildren().addAll(rec,text);
		
        //set nodes
		pane.setFocusTraversable(true);
		text.xProperty().bind(x);
		text.yProperty().bind(y);
		rec.setFill(Color.YELLOW);
		//set mouse movement
		pane.setOnMouseMoved(e ->{
			if ( rec.contains(e.getX(),e.getY())) 
				text.setText("YOUR MOUSE IS IN THE RECTANGLE");
			else
				text.setText("Your Mouse is not in Rectangle");
			x.set(e.getX());
			y.set(e.getY());
		});
		
		primaryStage.show();
	}

}
