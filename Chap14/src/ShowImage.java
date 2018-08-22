import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowImage extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new BorderPane();
		pane.setPadding(new Insets(5,5,5,5));
		Image image = new Image("http://www.siimg.com/u/20180816/0751475.jpg");
		pane.getChildren().add(new ImageView(image));
		ImageView imageView2 = new ImageView(image);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		pane.getChildren().add(imageView2);
		
		ImageView imageView3 = new ImageView(image);
		imageView3.setRotate(80);
		pane.getChildren().add(imageView3);
		
		Scene scene= new Scene(pane);
		primaryStage.setTitle("ShowImage");
		primaryStage.setScene(scene);
		for ( int i = 0 ; i < 3; i ++) {
		primaryStage.show();
		}
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	
	
}

