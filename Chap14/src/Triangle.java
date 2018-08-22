import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Polygon;;

public class Triangle extends StackPane {
	private Polygon triangle;
	private String strokeColor = "black";
	private String fillColor = "White";
	
	
	public Triangle() {
		this(100,100,200,100,150,50);
	}
	
	public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
		this.setWidth(Math.abs(x2-x1));
		this.setHeight(Math.abs(y1-y2));
		this.setPadding(new Insets(0,0,0,0));
	    triangle = new Polygon( x1, y1, x2, y2, x3,y3);
		this.getChildren().add(triangle);
		String styleString = "-fx-stroke:"+strokeColor+"; -fx-fill: "+fillColor;
		triangle.setStyle(styleString);
	}
	
	public void setStyle(String strokeColor,String fillColor) {
		this.strokeColor = strokeColor;
		this.fillColor = fillColor;
		String styleString = "-fx-stroke:"+strokeColor+"; -fx-fill: "+fillColor;
		this.setStyle(styleString);
	}
	
}
