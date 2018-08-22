import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class ShowFlowPane extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(10,10,10,10));//specifies the size of border of a pane
		pane.setHgap(10);
		pane.setVgap(5);
		pane.setOrientation(Orientation.VERTICAL);
		
		pane.getChildren().addAll(new Label("FirstName"),new TextField(), new Label("MI: "));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(100);
		pane.getChildren().addAll(tfMi,new Label("Last Name"),new TextField());
		//pane.getChildren().remove(tfMi);
		
		Scene scene = new Scene(pane,200,250);
		primaryStage.setTitle("ShowFlowPane");
		primaryStage.setScene(scene);
		//primaryStage.setResizable(false);
		primaryStage.show();
		
	}
}