
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class FindngBoundingRectangle extends Application {
	private Rectangle rectangle = new Rectangle(250,250,30,30);
	private double leftMostX;
	private double rightMostX;
	private double lowestY;
	private double topMostY;
    private Pane pane = new Pane();
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		leftMostX = rectangle.getX();
		rightMostX =rectangle.getX()+rectangle.getWidth();
		lowestY = rectangle.getY()+rectangle.getHeight();
		topMostY = rectangle.getY();
		rectangle.setStroke(Color.BLACK);
		rectangle.setFill(Color.WHITE);
	
		pane.setOnMouseClicked(e ->{
			Circle circle = new Circle(e.getX(),e.getY(),10);
			circle.setFill(Color.LIGHTGREEN);
			circle.setStroke(Color.WHITE);
			pane.getChildren().add(circle);
			if ( circle.getRadius() + circle.getCenterX() > rightMostX) {
				rightMostX = circle.getRadius() + circle.getCenterX();
				rectangle.widthProperty().set(rightMostX - leftMostX);
			}
			
			if ( circle.getRadius() + circle.getCenterY() > lowestY) {
				lowestY = circle.getRadius() + circle.getCenterY();
				rectangle.heightProperty().set(lowestY - topMostY);
			}
			
			if (- circle.getRadius() + circle.getCenterX() < leftMostX) {
				leftMostX = -circle.getRadius() + circle.getCenterX();
				rectangle.xProperty().set(leftMostX);
				rectangle.widthProperty().set(rightMostX - leftMostX);
				
			}
			if ( -circle.getRadius() + circle.getCenterY() < topMostY) {
				topMostY = -circle.getRadius() + circle.getCenterY();
				rectangle.yProperty().set(topMostY);
				rectangle.heightProperty().set(lowestY - topMostY);
			}
		});
		
		pane.getChildren().add(rectangle);
		Scene scene = new Scene(pane,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
