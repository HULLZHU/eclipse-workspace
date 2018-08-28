import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Demo extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Button btOK = new Button("OKOK");
		btOK.setOnAction(new Handler());
		pane.getChildren().add(btOK);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private class Handler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getSource());
		}
		
	}

}
