import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
public class Octagon extends Pane {
	public Octagon() {
		Polygon polygon = new Polygon();
		ObservableList<Double> list = polygon.getPoints();
	
		
		final double WIDTH =200, HEIGHT = 200;
		double centerX = WIDTH/2,centerY = HEIGHT/2;
		double radius = Math.min(WIDTH, HEIGHT)*0.4;
		
		for ( int i = 0; i < 6; i++) {
			list.add(centerX + radius*Math.cos(2*i*Math.PI/6));
			list.add(centerY - radius*Math.cos(2*i*Math.PI/6));
		}
		polygon.setFill(Color.RED);
		this.getChildren().add(polygon);
	
	}

}
