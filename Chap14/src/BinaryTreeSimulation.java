import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BinaryTreeSimulation extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		int numberOfSteps = 10;
		Circle[][] nodes = new Circle[10][];
		
		for ( int i = 0 ; i < nodes.length ; i ++ ) {
			nodes[i] = new Circle[i+1];
			nodes[i][0].setCenterY( 30*i);
			nodes[i][0].setCenterX(60 * i);
			pane.getChildren().add(nodes[i][0]);
			for ( int j = 1 ; j < nodes[i].length ; j ++) {
				nodes[i][j].setCenterY(i - 30 * j);
				nodes[i][j].setCenterX(60*i);
				pane.getChildren().add(nodes[i][j]);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
