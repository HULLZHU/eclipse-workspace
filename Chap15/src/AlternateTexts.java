import java.awt.Font;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AlternateTexts extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Text text1 = new Text("Java is fun");
		text1.xProperty().bind(pane.widthProperty().multiply(0.5).subtract(20));
		text1.yProperty().bind(pane.heightProperty().multiply(0.5));
		
		Text text2 = new Text("Java is Cool");
		text2.xProperty().bind(pane.widthProperty().multiply(0.5).subtract(20));
		text2.yProperty().bind(pane.heightProperty().multiply(0.5));
		
		pane.getChildren().add(text1);
		text1.setOnMouseClicked(e ->{
			pane.getChildren().clear();
			pane.getChildren().add(text2);
		});
		
		text2.setOnMouseClicked(e ->{
			pane.getChildren().clear();
			pane.getChildren().add(text1);
		});
		
		
		
		Scene scene = new Scene(pane,100,100);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
