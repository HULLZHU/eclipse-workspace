import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class SierpinskiTriangle extends Application{

	static int count = 0;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		SierpinskiTrianglePane trianglePane = new SierpinskiTrianglePane();
		TextField tfOrder = new TextField();
		trianglePane.setOnMouseClicked(e ->{
			trianglePane.setOrder(Integer.parseInt(tfOrder.getText()));
			tfOrder.setPrefColumnCount(4);
			tfOrder.setAlignment(Pos.BOTTOM_RIGHT);
		});
		
		//Pane to hold label, textfield, and a button
		HBox hbox= new HBox();
		hbox.getChildren().addAll(new Label("Enter an order"),tfOrder);
		hbox.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(trianglePane);
		borderPane.setBottom(hbox); 
		
		Scene scene = new Scene(borderPane,200,210);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		scene.widthProperty().addListener( ov->{
			trianglePane.paint();
		});
		scene.heightProperty().addListener(ov ->{
			trianglePane.paint();
		});
		
	}

	public static class SierpinskiTrianglePane extends Pane{
		private int order = 0;
		
		public void setOrder(int order) {
			this.order = order;
			paint();
		}

		protected void paint() {
			Point2D p1 = new Point2D(this.getWidth()/2,10);
			Point2D p2 = new Point2D(10,this.getHeight()-10);
			Point2D p3 = new Point2D(this.getWidth()-10,this.getHeight()-10);
			this.getChildren().clear();
			
			displayTriangles(order,p1,p2,p3);
		}

		private void displayTriangles(int order, Point2D p1, Point2D p2, Point2D p3) {
			count ++;
			if ( order == 0) {
				Polygon triangle = new Polygon();
				triangle.getPoints().addAll(p1.getX(),p1.getY(),p2.getX(),p2.getY(),p3.getX(),p3.getY());
				triangle.setStroke(Color.BLACK);
				triangle.setFill(Color.WHITE);
				this.getChildren().add(triangle);
			}
			
			else {
				Point2D p12 = p1.midpoint(p2);
				Point2D p23 = p2.midpoint(p3);
				Point2D p13 = p3.midpoint(p1);
				
				displayTriangles(order - 1, p1,p12,p13);
				displayTriangles(order - 1, p2,p12,p23);
				displayTriangles(order - 1, p3,p13,p23);
			}
			
			System.out.println(count);
		}
		
	}

}
