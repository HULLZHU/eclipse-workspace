import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
	static Text text = new Text(20,20,"Programming is fun");
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.getChildren().add(text);
		text.setOnMouseDragged(new mouseHandler());
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	class mouseHandler implements EventHandler<MouseEvent>{
		@Override
		public void handle(MouseEvent e) {
			text.setX(e.getX());
			text.setY(e.getY());
		}
		
	}

	
}
