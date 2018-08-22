import javafx.application.*;
import javafx.stage.*;
public class TestMainAndStage  extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println("StartMethod  is launched.");
	}
	
	public static void main(String [] args) {
		System.out.println("launch application");
		launch(args);
	}

}
