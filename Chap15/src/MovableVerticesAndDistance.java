import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MovableVerticesAndDistance extends Application{
	private Circle circle1 = new Circle(10);
	private Circle circle2 = new Circle(10);
	private Line line = new Line();
	Text text = new Text();
	DoubleProperty startX = new SimpleDoubleProperty();
	DoubleProperty startY = new SimpleDoubleProperty();
	DoubleProperty endX = new SimpleDoubleProperty();
	DoubleProperty endY = new SimpleDoubleProperty();
	StringProperty str = new SimpleStringProperty();
	DoubleProperty distance = new SimpleDoubleProperty();
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		//binding action
		circle1.centerXProperty().bind(startX);
		circle1.centerYProperty().bind(startY);
		circle2.centerXProperty().bind(endX);
		circle2.centerYProperty().bind(endY);
		line.startXProperty().bind(startX);
		line.startYProperty().bind(startY);
		line.endYProperty().bind(endY);
		line.endXProperty().bind(endX);
		text.xProperty().bind((circle1.centerXProperty().add(circle2.centerXProperty())).divide(2));
		text.yProperty().bind((circle1.centerYProperty().add(circle2.centerYProperty())).divide(2));
		//initialize variable
		startX.set(40);
		startY.set(40);
		endX.set(120);
		endY.set(150);
		circle1.setFill(Color.WHITE);
		circle1.setStroke(Color.BLACK);
		circle2.setFill(Color.WHITE);
		circle2.setFill(Color.BLACK);
		double squareDistance1 = (startX.get()-endX.get())*(startX.get()-endX.get())+(startY.get()-endY.get())*(startY.get()-endY.get());
	    distance.set(Math.sqrt(squareDistance1));
	    text.setText(distance.get() +"");
		//set movement
		circle1.setOnMouseDragged(e ->{
			startX.set(e.getX());
			startY.set(e.getY());
			double squareDistance = (startX.get()-endX.get())*(startX.get()-endX.get())+(startY.get()-endY.get())*(startY.get()-endY.get());
		    //distance.set(Math.sqrt(squareDistance));
		    text.setText(distance.get() +"");
		});
		
		circle2.setOnMouseDragged( e->{
			endX.set(e.getX());
			endY.set(e.getY());
			double squareDistance = (startX.get()-endX.get())*(startX.get()-endX.get())+(startY.get()-endY.get())*(startY.get()-endY.get());
		    distance.set(Math.sqrt(squareDistance));
		    text.setText(distance.get() +"");
		});
		
		
		Pane pane = new Pane();
		pane.getChildren().addAll(line,circle1,circle2,text);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
