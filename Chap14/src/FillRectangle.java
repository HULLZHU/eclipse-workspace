import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
public class FillRectangle extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//create pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(10,10,10,10));
		
		//create rectangle
		Rectangle rec1 = new Rectangle(10,10,40,20);
		rec1.setArcHeight(10);
		rec1.setArcWidth(10);
		rec1.setFill(Color.BLUE);
		pane.getChildren().add(rec1);
		Scene scene = new Scene(pane);
		arg0.setScene(scene);
		arg0.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}

}