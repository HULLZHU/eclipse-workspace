import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestLoanCalculator extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		LoanCalculator cal = new LoanCalculator();
		Scene scene = new Scene(cal,350,250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
