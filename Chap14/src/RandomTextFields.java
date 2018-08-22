import javafx.application.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
public class RandomTextFields extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		
		for ( int row = 0; row < 10; row ++ ) {
			for( int column = 0; column < 10; column ++ ) {
				TextField textField = new TextField();
				double guess = Math.random();
				if ( guess >= 0.5)
					textField.setText("" + 1);
				else
					textField.setText("" + 0);
				
				textField.setPrefColumnCount(1);
				pane.add(textField, row, column);
			}
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}