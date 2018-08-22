import javafx.application.Application;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class DisplayArrowLine extends Application{

	public static void main(String[] args) {
	launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		double paneWidth = 300;
		double paneHeight = 250;
		double x1 = Math.random()*(paneWidth-12);
		double y1 = Math.random()*(paneHeight - 12);
		double x2 = Math.random()*(paneWidth - 12);
		double y2 = Math.random()*(paneHeight - 12);
		
		drawArrowLine(x1,y1,x2,y2,pane);
		
		Scene scene = new Scene (pane,400,250);
		primaryStage.setTitle("Exercise14_20");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void drawArrowLine(double x1, double y1, double x2, double y2, Pane pane) {
		pane.getChildren().add(new Line(x1,y1,x2,y2));
		
		//find slope of this line
		double slope = (y1-y2)/(x1-x2);
		double arctan = Math.atan(slope);
		// This will flip the arrow 45 off of a
	    // perpendicular line at pt x2
	    double set45 = 1.57 / 2;
	    
	    // arrows should always point towards i, not i+1
	    if (x1 < x2) {
	      // add 90 degrees to arrow lines
	      set45 = -1.57 * 1.5;
	    }

	    // set length of arrows
	    int arrlen = 15;

	    // draw arrows on line
	    pane.getChildren().add(new Line(x2, y2, (x2 + (Math.cos(arctan + set45) * arrlen)),
	      ((y2)) + (Math.sin(arctan + set45) * arrlen)));

	    pane.getChildren().add(new Line(x2, y2, (x2 + (Math.cos(arctan - set45) * arrlen)),
	      ((y2)) + (Math.sin(arctan - set45) * arrlen)));
		
	}

}
