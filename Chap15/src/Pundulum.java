import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pundulum extends Application {
	private Pane pane = new Pane();
	private Circle smallBall = new Circle(300,10,5);
	private Circle bigBall = new Circle(300,100,15);
	private double startAngle = -90;
	private double count = 0;
	private Line line = new Line(smallBall.getCenterX(),smallBall.getCenterY(),bigBall.getCenterX(),bigBall.getCenterY());
	private double rate = 3;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().addAll(line,bigBall,smallBall);
		//bind the place of balls and panes
		line.startXProperty().bind(smallBall.centerXProperty());
		line.startYProperty().bind(smallBall.centerYProperty());
		line.endXProperty().bind(bigBall.centerXProperty());
		line.endYProperty().bind(bigBall.centerYProperty());
		//set event handler
		EventHandler<ActionEvent> rotateHandler = e ->{
			if ( startAngle == -90 || startAngle == 90) {
				count++;
			}
			if(startAngle>=-90&&startAngle<90&&count%2==1) {
				startAngle+= 1;
				bigBall.setCenterX(smallBall.getCenterX()+90 * Math.sin(Math.toRadians(startAngle)));
				bigBall.setCenterY(smallBall.getCenterY()+90 * Math.cos(Math.toRadians(startAngle)));
			}
			
			if(startAngle >- 90 &&startAngle<=90 &&count%2==0) {
				startAngle-= 1;
				bigBall.setCenterX(smallBall.getCenterX()+90 * Math.sin(Math.toRadians(startAngle)));
				bigBall.setCenterY(smallBall.getCenterY()+90 * Math.cos(Math.toRadians(startAngle)));
			}
		};
		//set Path
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(3),rotateHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.setRate(rate);
		animation.setAutoReverse(true);
		animation.play();
		
		bigBall.setOnKeyPressed(e->{
			if(e.getCode()==KeyCode.W) {
				rate -= 0.2;
				animation.setRate(rate);
				System.out.println(animation.getRate());
			}
			else if (e.getCode() == KeyCode.S&&animation.getRate()>=0.2) {
				rate -= 0.2;
				animation.setRate(rate);
				System.out.println(animation.getRate());
			}
		});
		
		pane.setOnMouseClicked(e->{
			animation.setRate(animation.getRate()+0.2);
		});
	
		
		bigBall.requestFocus();
		
		Scene scene = new Scene(pane,500,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
