import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class RandomTicTacToe extends Application{

	
	public static void main(String[] args)  {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(5);
		pane.setVgap(5);
	    Image x = new Image("file:image/x.gif");
	    Image o = new Image("file:image/o.gif");
		int[][] matrix = new int[3][3];
		for ( int i = 0; i <matrix.length; i ++ ) {
			for ( int j =0; j < matrix.length; j ++ ) {
				int randomNumber = (int)(3*Math.random());
				if ( randomNumber == 0 )
					pane.add(new ImageView(x), i, j);
				else if ( randomNumber == 1)
					pane.add(new ImageView(o), i, j);
				else
					continue;
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
