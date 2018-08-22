import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class CircleWords extends Application{
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		String str = "I love Lin Ziqi";
		double angle = 360/str.length();
		
		for ( int i = 0; i <str.length() ; i ++ ) {
			Text text = new Text("                                                     "+str.charAt(i)+"");
			pane.getChildren().add(text);
			text.setFont(Font.font("Times New Roman", FontWeight.LIGHT,FontPosture.REGULAR,32));
			text.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
			text.setRotate(angle*i);
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}