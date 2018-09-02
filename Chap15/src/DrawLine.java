import javafx.scene.paint.*;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class DrawLine extends Application {
	private Button up = new Button("UP");
	private Button down = new Button("DOWN");
	private Button left = new Button("LEFT");
	private Button right = new Button("RIGHT");
	private Pane pane = new Pane();
    private double x = pane.getWidth()/2 ;
	private double y = pane.getHeight()/2;
	private Polyline polyline = new Polyline();
	private Circle circle = new Circle();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set circle's property
		DoubleProperty centerX = new SimpleDoubleProperty();
		DoubleProperty centerY = new SimpleDoubleProperty();
		circle.centerXProperty().bind(centerX);
		circle.centerYProperty().bind(centerY);
		circle.setFill(Color.YELLOW);
		circle.setRadius(5);
		//set buttons layout
		up.setLayoutX(50);
		up.setLayoutY(35);
		down.setLayoutX(40);
		down.setLayoutY(60);
		left.setLayoutX(0);
		left.setLayoutY(60);
		right.setLayoutX(90);
		right.setLayoutY(60);
		//add to pane
		pane.getChildren().add(polyline);
		pane.getChildren().add(circle);
		//pane.getChildren().addAll(up,down,left,right);
		
		Scene scene = new Scene(pane,1000,1000);
		//initialize point coordinates
		x =scene.getWidth()/2;
		y =scene.getHeight()/2;
		ObservableList<Double> list = polyline.getPoints();
		list.addAll(x,y);
	
		//set button function
		up.setOnAction( e->{
			y -= 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
		});
		
		down.setOnAction( e->{
			y += 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
		});
		
		left.setOnAction( e->{
			x -= 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
		});
		
		right.setOnAction( e->{
			x += 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
		});
		
		//set arrow key function
		polyline.setOnKeyPressed( e->{
			switch(e.getCode()) {
			case UP : y -= 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
			break;
			case DOWN: y += 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
			break;
			case LEFT: x -= 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
			break;
			case RIGHT: x += 10;
			list.addAll(x,y);
			centerX.set(x);
			centerY.set(y);
			break;
			default:
			}
		});
		polyline.requestFocus();

	
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
