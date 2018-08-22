import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class Fan extends Pane {
	private Circle circle;
	private Arc arc;
	private double radiusOfCircle;
	private double radiusOfFan;
	
	
	public Fan(double radiusOfCircle,double radiusOfFan) {
		this.radiusOfCircle = radiusOfCircle;
		this.radiusOfFan = radiusOfFan;
		circle = new Circle(150,150,radiusOfCircle);
		Arc arc1 = new Arc(150,150,radiusOfFan,radiusOfFan,30,30);
		arc1.setType(ArcType.ROUND);
		Arc arc2 = new Arc(150,150,radiusOfFan,radiusOfFan,120,30);
		arc2.setType(ArcType.ROUND);
		Arc arc3 = new Arc(150,150,radiusOfFan,radiusOfFan,-30,-30);
		arc3.setType(ArcType.ROUND);
		Arc arc4 = new Arc(150,150,radiusOfFan,radiusOfFan,-120,-30);
		arc4.setType(ArcType.ROUND);
		circle.setStroke(Color.BLUE);
		circle.setOpacity(10);
		circle.setFill(Color.WHITE);
		this.getChildren().addAll(circle,arc1,arc2,arc3,arc4);
	}
	
	public Fan() {
		this(140,120);
	}

}