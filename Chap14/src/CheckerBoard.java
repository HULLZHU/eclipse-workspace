import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
public class CheckerBoard extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		primaryStage.setHeight(1050);
		primaryStage.setWidth(1000);
		primaryStage.setResizable(false);
		for( int row = 1; row <= 8; row ++) {
			for ( int column = 1; column <=8 ; column ++) {
				Rectangle rec = new Rectangle();
				rec.widthProperty().bind(primaryStage.widthProperty().divide(8));
				rec.heightProperty().bind(rec.widthProperty());
				//rec.setWidth(50);
				//rec.setHeight(50);
				if ( row % 2 == 1) {
					if ( column % 2 == 1)
						rec.setFill(Color.WHITE);
					else
						rec.setFill(Color.BLACK);
				}
				else if ( row % 2 == 0) {
					if ( column % 2 == 1) 
						rec.setFill(Color.BLACK);
					else
						rec.setFill(Color.WHITE);
				}
				pane.add(rec, row-1, column-1);
			}
		}
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
