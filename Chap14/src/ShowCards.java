import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

public class ShowCards extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		
		for ( int row = 0,count = 0; row< 9 ; row ++ ) {
			for ( int column = 0; column < 6; column ++,count++ ) {
				String imageName = count+".png";
				String directory = "file:image/card/"+imageName;
				ImageView imageView = new ImageView(directory);
				
				pane.add(imageView, row, column);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}