import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

public class Fan extends Pane{
	private double width = 200;
	private double height = 200;
	private Arc arcs[]  = new Arc[4];
	private double radius = Math.min(width, height)*0.45;
	private double startAngle = 90;
	private double angle = 30;
	private double increment = 1;
	private double centerX = width/2 + 20;
	private double centerY = height/2 +20;
	private Circle circle = new Circle(centerX,centerY,radius*1.1);

	
	
	public Fan() {
		this.getChildren().add(circle);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.YELLOW);
		for (int i = 0; i < arcs.length; i++) {
			arcs[i] = new Arc(centerX,centerY,radius,radius,startAngle,30);
			startAngle += 90;
			arcs[i].setFill(Color.WHITE);
			arcs[i].setStroke(Color.GREEN);
			arcs[i].setType(ArcType.ROUND);
			this.getChildren().add(arcs[i]);
		    } 
	}
	
	public void run() {
		for ( int i = 0 ; i < arcs.length ; i++ ) {
			arcs[i].setStartAngle(arcs[i].getStartAngle()+increment);
		}
	}
	
	public void reverse() {
		for ( int i = 0; i < arcs.length ; i ++ ) {
			arcs[i].setStartAngle(arcs[i].getStartAngle()-increment);
		}
	}
	
	public void setStartAngle(double startAngle) {
		this.startAngle = startAngle;
	}

}
