import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.application.Platform;;
public class FlashingText extends Application {
	private String text = "";
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane pane = new StackPane();
		Label lbText = new Label("Programming is fun");
		pane.getChildren().add(lbText);
		
		new Thread(new Runnable() {
			@Override
			public void run(){
				try {
					while (true) {
						if ( lbText.getText().trim().length() == 0)
							text = "welcome";
						else 
							text = "";
						Platform.runLater(new Runnable() {

							@Override
							public void run() {
								lbText.setText(text);
							}
						});
						
						Thread.sleep(2000);
					}
					
				}
				catch (InterruptedException ex) {
					
				}
			}
		}).start();
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
   