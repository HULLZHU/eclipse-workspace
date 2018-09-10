import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class Car extends Pane {
	private Polygon polygon = new Polygon();
	private Circle wheel1 = new Circle(15,25,5);
	private Circle wheel2 = new Circle(35,25,5);
	private Rectangle rectangle = new Rectangle(0,10,50,10);
	
	public Car() {
		this.getChildren().addAll(polygon,wheel1,wheel2,rectangle);
		ObservableList<Double> list = polygon.getPoints();
		list.addAll(10.0,10.0,20.0,0.0,30.0,0.0,40.0,10.0);
		polygon.setFill(Color.BLUE);
		wheel1.setFill(Color.GRAY);
		wheel2.setFill(Color.GRAY);
		rectangle.setFill(Color.GREEN);
	}

}
