import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxandVBox extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create border pane
		BorderPane pane = new BorderPane();
		
		//place nodes in the pane
		pane.setTop(getHBox());
		pane.setLeft(getVBox());
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBox&&VBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private Node getVBox() {
		VBox vBox= new VBox(30);
		//Following code changes the vertical gap
		//vBox.setSpacing(20);
		vBox.setPadding(new Insets(15,15,15,15));
		vBox.getChildren().add(new Label("Course"));
		
		Label[] courses = {new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 2410"),new Label("CSCI 3720")};
		for ( Label course : courses) {
			vBox.setMargin(course, new Insets(15,15,15,15));
			vBox.getChildren().add(course);
		}
		return vBox;
	}

	private Node getHBox() {
		//15 means horizontal gap between nodes
		HBox hbox = new HBox(100);
		hbox.setPadding(new Insets(20,20,20,20));
		hbox.setAlignment(Pos.CENTER);
		//define the background color
		hbox.setStyle("-fx-background-color:gold");
		hbox.getChildren().add(new Button("ComputerScience"));
		hbox.getChildren().add(new Button ( "Chemistry"));
		ImageView imageView = new ImageView(new Image("file:image/us.gif"));
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		hbox.getChildren().add(imageView);
		return hbox;
	}
	
	
	public static void main(String [] args) {
		launch(args);
	}
}
