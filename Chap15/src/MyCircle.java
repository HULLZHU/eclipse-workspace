import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends Circle {
	public MyCircle() {
		super();
		this.setRadius(10);
		this.setFill(Color.WHITE);
		this.setStroke(Color.BLACK);
		this.setOnMouseEntered( e->{
			if ( e.isSecondaryButtonDown()) {
				this.setStroke(Color.WHITE);
			}
		});
	}
}
