import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;;

public class TestButtonInPane extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane myPane = new StackPane();
		Button ok = new Button("OK");
		ok.setRotate(80);
		myPane.getChildren().add(ok);
		Scene scene = new Scene(myPane,200,50);
		primaryStage.setTitle("Hello");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();	
	}
	
	public static void main(String [] args) {
		launch(args);
	}

}
