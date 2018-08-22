import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class ShowArc extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new FlowPane();
		
		//create an arc
		Arc arc1 = new Arc(150,100,80,120,30,35);
		arc1.setFill(Color.color(Math.random(),Math.random(),Math.random()));
		arc1.setType(ArcType.ROUND);
		pane.getChildren().add(new Text(210,40, "Arc1: round"));
		pane.getChildren().add(arc1);
		
		Arc arc2 = new Arc(150,100,80,120,30+90,35);
		arc2.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		pane.getChildren().add(arc2);
		pane.getChildren().add(new Text(20,50,"Arc2: open"));
		
		Arc arc3 = new Arc(150,100,80,120,30+180,35);
		arc3.setFill(Color.color(Math.random(), Math.random(), Math.random()));
		arc3.setType(ArcType.CHORD);
		arc3.setStroke(Color.BLACK);
		pane.getChildren().add(new Text(20,170,"Arc3: chord"));
		pane.getChildren().add(arc3);
		
		Arc arc4  = new Arc(150,100,80,120,30+270,35);
		arc4.setFill(Color.GREEN);
		arc4.setType(ArcType.CHORD);
		arc4.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
		pane.getChildren().add(arc4);
		pane.getChildren().add(new Text(210,170,"Arc4 : chord"));
		
		
		Scene scene = new Scene(pane,200,200);
		primaryStage.setTitle("ShowArc");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String args[]) {
		launch(args);
	}
	

}
