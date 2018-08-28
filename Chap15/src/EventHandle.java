import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class EventHandle extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		HBox pane = new HBox();
		pane.setAlignment(Pos.CENTER);
		Button buttonOK = new Button("OK");
		Button buttonCancel = new Button("Cancel");
		OKHandlerClass handler1 = new OKHandlerClass();
		CancelHandlerClass handler2 = new CancelHandlerClass();
		// buttonOK Inherits the method handle defined in handler1 instance. 
		buttonOK.setOnAction(handler1);
		buttonCancel.setOnAction(handler2);
		
		pane.getChildren().addAll(buttonOK,buttonCancel);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);;
		primaryStage.show();
		
		
	}
	
	 class OKHandlerClass implements EventHandler<ActionEvent>{

		@Override
		//this defined method will be set as the method used by an event source object
		public void handle(ActionEvent e) {
			System.out.println("Ok Button Clicked");
		}
	}
	 
	 class CancelHandlerClass implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent arg0) {
			System.out.println("Cancel Button Clicked");
		}
		 
	 }

}
