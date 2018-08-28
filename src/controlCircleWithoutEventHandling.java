import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
public class controlCircleWithoutEventHandling extends Application {
	private CirclePane circlePane = new CirclePane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		HBox hbox = new HBox();
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Englarge");
		Button btShrink = new Button("Shrink");
		hbox.getChildren().addAll(btEnlarge,btShrink);
		
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		
		BorderPane borderPane = new BorderPane();
		//borderPane.getChildren().add(circlePane)会导致编译错误，原因是什么？记得google
		//borderPane can set other pane nodes to some of its space, but can't getChildren().add(paneNodes)
		//it will result in compile error
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hbox);
		BorderPane.setAlignment(hbox, Pos.TOP_CENTER);
		Scene scene = new Scene(borderPane,200,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ControlCircle");
		primaryStage.show();
		
	}
	
	class EnlargeHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		}
	}
	
	class ShrinkHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
		
	}
	
	class CirclePane extends StackPane{
		private Circle circle = new Circle(50);
		
		public CirclePane() {
			getChildren().add(circle);
			circle.setStroke(Color.BLACK);
			circle.setFill(Color.WHITE);
		}
		
		public void enlarge() {
			circle.setRadius(circle.getRadius()+2);
		}
		
		public void shrink() {
			circle.setRadius(circle.getRadius()>2?circle.getRadius()-2 : circle.getRadius());
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
