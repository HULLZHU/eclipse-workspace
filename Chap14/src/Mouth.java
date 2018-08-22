import javafx.geometry.Insets;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;

public class Mouth extends StackPane{
	public Mouth() {
		this.setHeight(80);
		this.setWidth(300);
		Arc mouth = new Arc(300,300,150,80,0,-180);
		this.getChildren().add(mouth);
		mouth.setFill(Color.WHITE);
		mouth.setStroke(Color.BLACK);
	}
}