import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayAngles extends Application {
	private Circle ver1 = new Circle(6);
	private Circle ver2 = new Circle(6);
	private Circle ver3 = new Circle(6);
	private Line line12 = new Line();
	private Line line13 = new Line();
	private Line line23 = new Line();
	private Text text1 = new Text();
	private Text text2 = new Text();
	private Text text3 = new Text();
	private double distance12;
	private double distance13;
	private double distance23;
	private DoubleProperty angle1 = new SimpleDoubleProperty();
	private DoubleProperty angle2 = new SimpleDoubleProperty();
	private DoubleProperty angle3 = new SimpleDoubleProperty();
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		pane.getChildren().addAll(line12,line23,line13,ver1,ver2,ver3,text1,text2,text3);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		//bind lines' place
		line12.startXProperty().bind(ver1.centerXProperty());
		line12.startYProperty().bind(ver1.centerYProperty());
		line12.endXProperty().bind(ver2.centerXProperty());
		line12.endYProperty().bind(ver2.centerYProperty());
		line23.startXProperty().bind(ver2.centerXProperty());
		line23.startYProperty().bind(ver2.centerYProperty());
		line23.endXProperty().bind(ver3.centerXProperty());
		line23.endYProperty().bind(ver3.centerYProperty());
		line13.startXProperty().bind(ver1.centerXProperty());
		line13.startYProperty().bind(ver1.centerYProperty());
		line13.endXProperty().bind(ver3.centerXProperty());
		line13.endYProperty().bind(ver3.centerYProperty());
		//bind text places
		text1.xProperty().bind(ver1.centerXProperty());
		text1.yProperty().bind(ver1.centerYProperty());
		text2.xProperty().bind(ver2.centerXProperty());
		text2.yProperty().bind(ver2.centerYProperty());
		text3.xProperty().bind(ver3.centerXProperty());
		text3.yProperty().bind(ver3.centerYProperty());
		//set vertices
		ver1.setFill(Color.YELLOW);
		ver1.setCenterX(100);
		ver1.setCenterY(100);
		ver2.setFill(Color.YELLOW);
		ver2.setCenterX(200);
		ver2.setCenterY(100);
		ver3.setFill(Color.YELLOW);
		ver3.setCenterX(400);
		ver3.setCenterY(400);
		//set distances
		setAngles();
		text1.setText(angle1.get()+"");
		text2.setText(angle2.get()+"");
		text3.setText(angle3.get()+"");
		ver1.setOnMouseDragged( e ->{
			ver1.setCenterX(e.getX());
			ver1.setCenterY(e.getY());
			setAngles();
		});
		
		ver2.setOnMouseDragged( e ->{
			ver2.setCenterX(e.getX());
			ver2.setCenterY(e.getY());
			setAngles();
		});
		
		ver3.setOnMouseDragged( e ->{
			ver3.setCenterX(e.getX());
			ver3.setCenterY(e.getY());
			setAngles();
		});
		
		
	}
	private void setAngles() {
		distance12 = getDistance(ver1.getCenterX(),ver1.getCenterY(),ver2.getCenterX(),ver2.getCenterY());
		distance13 = getDistance(ver1.getCenterX(),ver1.getCenterY(),ver3.getCenterX(),ver3.getCenterY());
		distance23 = getDistance(ver2.getCenterX(),ver2.getCenterY(),ver3.getCenterX(),ver3.getCenterY());
		angle1.set(Math.acos((distance12*distance12 - distance23*distance23 + distance13*distance13)/(2*distance12*distance13)));
		angle2.set(Math.acos((distance23*distance23 - distance13*distance13 + distance12*distance12)/(2*distance12*distance23)));
		angle3.set(Math.acos((distance23*distance23 - distance12*distance12 + distance23*distance23)/(2*distance13*distance23)));
		text1.setText(angle1.get()+"");
		text2.setText(angle2.get()+"");
		text3.setText(angle3.get()+"");
		
	}
	private double getDistance(double centerX, double centerY, double centerX2, double centerY2) {
		double square = (centerX - centerX2)*(centerX - centerX2) + (centerY-centerY2)*(centerY-centerY2);
		return Math.sqrt(square);
	}

}
