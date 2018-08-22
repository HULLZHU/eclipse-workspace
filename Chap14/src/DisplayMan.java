import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DisplayMan extends Application {
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		Circle head = new Circle(100,100,50);
		Line body = new Line(100,150,100,450);
		Line leftHand = new Line(100,150,50,200);
		Line rightHand = new Line(100,150,150,200);
		Line leftLeg = new Line(100,450,50,600);
		Line rightLeg = new Line(100,450,150,600);
		
		pane.getChildren().addAll(head,body,leftHand,rightHand,leftLeg,rightLeg);
		
		Scene scene = new Scene(pane,300,700);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
