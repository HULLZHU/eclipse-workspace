import java.util.Collections;
import java.util.Comparator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MultipleBounceBall extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		MultipleBallPane ballPane = new MultipleBallPane();
		ballPane.setStyle("-fx-border-color:yellow");
		
		Button btAdd = new Button("+");
		Button btSubtract = new Button("-");
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btAdd,btSubtract);
		hBox.setAlignment(Pos.CENTER);
		
		//add or remove
		btAdd.setOnAction(e ->{
			ballPane.add();
		});
		 
		btSubtract.setOnAction(e->{
			ballPane.subtract();
		});
		//pause and resume action
		ballPane.setOnMousePressed(e ->ballPane.pause());
		ballPane.setOnMouseReleased(e ->ballPane.play());
		
		//use a scroll bar to control animation speed
		ScrollBar sbSpeed = new ScrollBar();
		sbSpeed.setMax(20);
		sbSpeed.setValue(10);
		ballPane.rateProperty().bind(sbSpeed.valueProperty());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setTop(sbSpeed);
		pane.setBottom(hBox);
		//create scene
		Scene scene = new Scene(pane,250,250);
		primaryStage.setTitle("Multiple BounceBall");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private class MultipleBallPane extends Pane{
		private Timeline animation;
		
		public MultipleBallPane() {
			animation = new Timeline(new KeyFrame(Duration.millis(50),e ->moveBalls()));
			animation.setCycleCount(Timeline.INDEFINITE);
			animation.play();
		} 
		
		public void add() {
			Color color = new Color(Math.random(), Math.random(), Math.random(), Math.random());
			this.getChildren().add(new Ball(15 + 30*Math.random(),15 + 30*Math.random(),2 + 18*Math.random(),color));
		}
		 
		public void subtract() {
			if (this.getChildren().size()>0) {
				ObservableList list = this.getChildren();
				Ball ball = Collections.max(list,new BallRadiusComparator());
				
				try {
					this.getChildren().remove(ball) ;}
				catch (Exception ex) {
					System.out.println("All the ball is deleted");
				}
			}
		} 
		
		public void play() {
			animation.play();
		}
		
		public void pause() {
			animation.pause(); 
		}
		 
		public DoubleProperty rateProperty() {
			return animation.rateProperty();
		}
		
		/**This method will be executed once per 0.05 second because it is involved in a Timeline Instance*/
		protected void moveBalls() {
			for (Node node : this.getChildren()) {
				Ball ball = (Ball)node;
				
				if ( ball.getCenterX() < ball.getRadius() || ball.getCenterX()>= this.getWidth() - ball.getRadius()) {
					ball.dx *= -1;
				}
				
				if ( ball.getCenterY() < ball.getRadius()||ball.getCenterY() > this.getHeight() -ball.getRadius()) {
					ball.dy *= -1;
				}
				ball.setCenterX(ball.dx + ball.getCenterX());
				ball.setCenterY(ball.dy + ball.getCenterY());
			}
		}
		
		
	}
	
	class Ball extends Circle{ 
		private double dx = 1,dy = 1;
		Ball(double x, double y, double radius, Color color){
			super(x,y,radius);
			this.setFill(color);
		}	
	}
	
	class BallRadiusComparator implements Comparator<Ball>,java.io.Serializable{

		@Override
		public int compare(Ball o1, Ball o2) {
			if ( o1.getRadius() > o2.getRadius())
				return 1;
			else if ( o1.getRadius() < o2.getRadius())
				return -1;
			else 
				return 0;
		}
		
	}
	


}
