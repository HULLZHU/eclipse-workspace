import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
public class ShowEllipseShow extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		//create Pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(50,50,100,100));
		//create ellipse
		Ellipse ellipse = new Ellipse(50,50,50,50);
		ellipse.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		
		pane.getChildren().add(ellipse);
		
		Scene scene = new Scene(pane);
		arg0.setScene(scene);
		arg0.show();
	}

}
