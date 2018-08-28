import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LamdaHandlerDemo extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hbox = new HBox();		
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button btNEW = new Button("NEW");
		Button btOPEN = new Button("OPEN");
		Button btSAVE = new Button("SAVE");
		Button btPRINT = new Button("PRINT");
		hbox.getChildren().addAll(btNEW,btOPEN,btSAVE,btPRINT);

		btNEW.setOnAction((ActionEvent e) -> {
			System.out.println("Process NEW");
		}); 
		
		btOPEN.setOnAction((ActionEvent e) -> {
			System.out.println("Process OPEN");
		});
		
		btSAVE.setOnAction((ActionEvent e)->{
			System.out.println("Process SAVE");
		});
		
		btPRINT.setOnAction((ActionEvent e)->{
			System.out.println("Process PRINT");
		});
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
