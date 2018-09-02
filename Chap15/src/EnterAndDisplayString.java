import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterAndDisplayString extends Application {
	private Pane pane = new Pane();
	String result ="";
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Text text = new Text("");	
		text.setFocusTraversable(true);
		
		StringBuilder str = new StringBuilder();
		//set on pressed
		text.setOnKeyPressed(e->{
			if ( e.getCode() != KeyCode.ENTER)
				str.append(e.getText());
			else {
				if ( str.length() != 0 )
					result = str.toString();
				else
					result = "YOU INPUT NOTHING";
				text.setText(result);
			}
		});
		
		pane.getChildren().add(text);
		Scene scene = new Scene(pane,1000,1000);
		text.setX(50);
		text.setY(50);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
