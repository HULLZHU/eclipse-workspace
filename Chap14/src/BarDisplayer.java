import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BarDisplayer extends Application{

	@Override
	public void start(Stage primary) throws Exception {
		double[] numbers = {1,1,1,1,1,2};
		Bar bar = new Bar(numbers);
		Scene scene = new Scene(bar);
		primary.setTitle("Idiot Bar Chart");
		primary.setScene(scene);
		primary.show();
		
	}
	
	public static void main(String args[]) {
		launch(args);
	}



}