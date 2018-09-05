import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DragPoints extends Application{
	private Pane pane = new Pane();
	private Circle circle = new Circle(100,150,100);
	private double radius = circle.getRadius();
	private Circle ver1 = new Circle(10);
	private Circle ver2 = new Circle(10);
	private Circle ver3 = new Circle(10);
	private Line line12 = new Line();
	private Line line13 = new Line();
	private Line line23 = new Line();
	private double radian1 = Math.random()*Math.PI*2;
	private double radian2 = Math.random()*Math.PI*2;
	private double radian3 = Math.random()*Math.PI*2;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set Layout
		pane.getChildren().addAll(circle,ver1,ver2,ver3,line12,line23,line13);
		//set circle
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		//set vertices
		ver1.setFill(Color.GREEN);
		ver2.setFill(Color.GREEN);
		ver3.setFill(Color.GREEN);
		ver1.setCenterX(circle.getCenterX()+radius*Math.cos(radian1));
		ver2.setCenterX(circle.getCenterX()+radius*Math.cos(radian2));
		ver3.setCenterX(circle.getCenterX()+radius*Math.cos(radian3));
		ver1.setCenterY(circle.getCenterY()+radius*Math.sin(radian1));
		ver2.setCenterY(circle.getCenterY()+radius*Math.sin(radian2));
		ver3.setCenterY(circle.getCenterY()+radius*Math.sin(radian3));
		//bind lines
		line12.startXProperty().bind(ver1.centerXProperty());
		line12.startYProperty().bind(ver1.centerYProperty());
		line12.endXProperty().bind(ver2.centerXProperty());
		line12.endYProperty().bind(ver2.centerYProperty());
		line23.startXProperty().bind(ver2.centerXProperty());
		line23.startYProperty().bind(ver2.centerYProperty());
		line23.endXProperty().bind(ver3.centerXProperty());
		line23.endYProperty().bind(ver3.centerYProperty());
		line13.startXProperty().bind(ver1.centerXProperty());
		line13.startYProperty().bind(ver1.centerYProperty());
		line13.endXProperty().bind(ver3.centerXProperty());
		line13.endYProperty().bind(ver3.centerYProperty());
		//
		ver1.setOnMouseDragged(e->{
				if ( getDistance(circle.getCenterX(),circle.getCenterY(),e.getX(),e.getY())==circle.getRadius()) {
					ver1.setCenterX(e.getX());
					ver1.setCenterY(e.getY());
					
				}
		});
		
		
		//show steps
		Scene scene = new Scene(pane,200,200);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private double getDistance(double centerX, double centerY, double x, double y) {
		double distanceSquare = (centerX-x)*(centerX-x)+(centerY-y)*(centerY-y);
		return Math.sqrt(distanceSquare);
	}

}
