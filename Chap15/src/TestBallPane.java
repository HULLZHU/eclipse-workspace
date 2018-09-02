import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestBallPane extends Application {

	public static void main(String[] args) 
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BallPane ball = new BallPane();
		Scene scene = new Scene(ball);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

}
