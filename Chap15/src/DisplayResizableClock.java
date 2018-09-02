import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
public class DisplayResizableClock extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ClockPane clock = new ClockPane();
		String timeString = clock.getHour() + ":"+clock.getMinute()+":"+clock.getSecond();
		Label lbCurrentTime = new Label(timeString);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(lbCurrentTime);
		BorderPane.setAlignment(lbCurrentTime, Pos.TOP_CENTER);
		
		Scene scene = new Scene(pane,250,250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.widthProperty().addListener(ov ->{
			clock.setW(scene.getWidth());
		});
		
		pane.heightProperty().addListener(ov ->{
			clock.setH(scene.getHeight());
		});
		
		//place clock and label in borderPane
	}

}
