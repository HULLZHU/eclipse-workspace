import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class ArrowHead extends Pane {
	public ArrowHead() {
		this.setHeight(200);
		this.setWidth(200);
		Line upper = new Line(100,100,90,95);
		Line lower = new Line(100,100,90,105);
		this.getChildren().add(upper);
		this.getChildren().add(lower);
	}

}
