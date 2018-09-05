import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DynamicallyResizedCylinder extends Application{
	private Pane pane = new Pane();
	private Ellipse ellipse = new Ellipse();
	private Arc lowerArc = new Arc(); 
	private Arc upperArc = new Arc();
	private Line leftLine = new Line();
	private Line rightLine = new Line();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(pane,500,500);
		//add nodes
		pane.getChildren().addAll(ellipse,leftLine,rightLine,lowerArc,upperArc);
		//bind properties
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerXProperty().bind(pane.heightProperty().divide(5));
		ellipse.radiusXProperty().bind(pane.widthProperty().divide(4));
		ellipse.radiusYProperty().bind(pane.heightProperty().divide(6));
		leftLine.startXProperty().bind(ellipse.centerXProperty().subtract(ellipse.radiusXProperty()));
		leftLine.endXProperty().bind(lowerArc.centerXProperty().subtract(lowerArc.radiusXProperty()));
		rightLine.startXProperty().bind(ellipse.centerXProperty().add(ellipse.radiusXProperty()));
		rightLine.endXProperty().bind(lowerArc.centerXProperty().add(lowerArc.radiusXProperty()));
		leftLine.startYProperty().bind(ellipse.centerYProperty());
		leftLine.endYProperty().bind(lowerArc.centerYProperty());
		rightLine.startYProperty().bind(ellipse.centerYProperty());
		rightLine.endYProperty().bind(lowerArc.centerYProperty());
		lowerArc.centerYProperty().bind(pane.heightProperty().divide(6).multiply(5));
		lowerArc.centerXProperty().bind(ellipse.centerXProperty());
		lowerArc.radiusXProperty().bind(ellipse.radiusXProperty());
		lowerArc.radiusYProperty().bind(ellipse.radiusYProperty());
		upperArc.centerYProperty().bind(pane.heightProperty().divide(6).multiply(5));
		upperArc.centerXProperty().bind(ellipse.centerXProperty());
		upperArc.radiusXProperty().bind(ellipse.radiusXProperty());
		upperArc.radiusYProperty().bind(ellipse.radiusYProperty());
		//set colors and others
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		leftLine.setStroke(Color.BLACK);
		rightLine.setStroke(Color.BLACK);
		lowerArc.setType(ArcType.OPEN);
		upperArc.setType(ArcType.OPEN);
		lowerArc.setFill(Color.WHITE);
		upperArc.setFill(Color.WHITE);
		lowerArc.setStroke(Color.BLACK);
		upperArc.setStroke(Color.BLACK);
		lowerArc.setStartAngle(0);
		lowerArc.lengthProperty().set(-180);
		upperArc.setStartAngle(0);
		upperArc.lengthProperty().set(180);
		upperArc.getStrokeDashArray().addAll(6.0,21.0);
		pane.layoutXProperty().bind(scene.widthProperty().divide(3));;
		pane.layoutYProperty().bind(scene.heightProperty().divide(3));
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		
		
	}

}
