import javafx.application.*;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
public class NewSierpinskiTriangle extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		TrianglePane trianglePane = new TrianglePane();
		pane.setCenter(trianglePane);
		HBox hbox = new HBox(8);
		pane.setBottom(hbox);
		Button btAdd = new Button("+");
		Button btDecrease = new Button("-");
		hbox.getChildren().addAll(btAdd,btDecrease);
		
		btAdd.setOnAction(e ->{
			trianglePane.increment();
			trianglePane.paint();
		});
		
		btDecrease.setOnAction(e ->{
			trianglePane.decrement();
			trianglePane.paint();
		});
		
		Scene scene = new Scene(pane,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static class TrianglePane extends Pane{
		private int order = 1;
		
		public void increment() {
			this.order++;
		}
		
		public void decrement() {
			this.order -- ;
		}
		
		public void paint() {
			Point2D p1 = new Point2D(this.getWidth()/2,10);
			Point2D p2 = new Point2D(10,this.getHeight()-10);
			Point2D p3 = new Point2D(this.getWidth()-10,this.getHeight()-10);
			this.getChildren().clear();
			displayTriangle(p1,p2,p3,order);
		}

		private void displayTriangle(Point2D p1, Point2D p2, Point2D p3,int order) {
			if ( order == 0) {
				Polygon triangle = new Polygon();
				triangle.getPoints().addAll(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
				triangle.setStroke(Color.BLACK);
				triangle.setFill(Color.WHITE);
				this.getChildren().add(triangle);
			}
			
			else {
			Point2D p12 = p1.midpoint(p2);
			Point2D p13 = p1.midpoint(p3);
			Point2D p23 = p2.midpoint(p3);
			
			displayTriangle(p12,p13,p1,order-1);
			displayTriangle(p13,p23,p3,order-1);
			displayTriangle(p23,p12,p2,order-1);
			order --;}
		}
		
	}

}
