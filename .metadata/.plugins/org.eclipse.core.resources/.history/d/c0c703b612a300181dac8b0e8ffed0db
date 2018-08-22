import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class ColorAndFont extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox pane = new HBox();
		pane.setPadding(new Insets(100,100,100,100));
		for ( int i=0; i <5 ; i ++ ) {
			Text text = new Text("Java");
			pane.getChildren().add(text);
			text.setFont(Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,22));
			text.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			text.setOpacity(Math.random());
			text.setRotate(90);
		}
		
		Scene scene = new Scene(pane,200,100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
