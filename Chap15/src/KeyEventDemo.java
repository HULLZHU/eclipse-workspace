import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Text text = new Text(20,20,"A");
		
		pane.getChildren().add(text);
		text.setOnKeyPressed(e ->{
			switch(e.getCode()) {
			case DOWN: text.setY(text.getY() + 10);
			break;
			case UP: text.setY(text.getY()-10);
			break;
			case LEFT: text.setX(text.getX()-10);
			break;
			case RIGHT:text.setX(text.getX()+10);
			break;
			default:
				if ( Character.isLetter(e.getText().charAt(0)))
					text.setText(e.getText());
			}
		});
		
		text.setOnMouseDragged(e ->{
			text.setX(e.getX());
			text.setY(e.getY());
		});
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		text.requestFocus();
	}
}
