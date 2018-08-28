import javafx.application.Application;
import javafx.event.ActionEvent;//
import javafx.event.EventHandler;//
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		Button btNew = new Button("NEW");
		Button btOpen = new Button("OPEN");
		Button btSave = new Button("Save");
		Button btPrint = new Button("Print");
		hbox.getChildren().addAll(btNew, btOpen,btSave,btPrint);
		btNew.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent e) {
			System.out.println("Process New");
			}
		});
		
		btOpen.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Process Open");
			}
		});
		
		btSave.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Process save");
			}
		});
		
		btPrint.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Process Print.");
			}
		});
		
		Scene scene = new Scene(hbox,300,50);
		primaryStage.setTitle("AnonymousHandlerDemo");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
