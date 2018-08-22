import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
public class RotateString extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new StackPane();
		pane.setPadding(new Insets(100,100,100,100));
		
		for ( int i = 0; i < 3 ; i ++ ) {
			Text text = new Text(100,100,"He Zhu is Cool");
			text.setFont(Font.font("Times New Roman", FontWeight.LIGHT,FontPosture.ITALIC,15));
			pane.getChildren().add(text);
			text.setRotate(60*i);
			text.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}