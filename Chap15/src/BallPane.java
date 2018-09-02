import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
	private final double radius = 20;
	private double x = radius, y =radius;
	private double dx =1, dy =1;
	private Circle circle = new Circle(x,y,radius);
	private Timeline animation;
	private Button speedUp = new Button("Speed Up");
	private Button speedDown = new Button("Speed Down");
	
	public BallPane() {
		circle.setFill(Color.GREEN);
		this.getChildren().add(circle);
		this.getChildren().addAll(speedUp,speedDown);
		animation = new Timeline( new KeyFrame(Duration.millis(50), new moveBallHandler()));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		setButtons();
		this.setOnMousePressed(new MousePressedEvent());
		this.setOnMouseReleased(new MouseReleasedEvent());
	}
	
	private void setButtons() {
		speedUp.setLayoutX(100);
		speedUp.setLayoutY(50);
		speedDown.setLayoutX(100);
		speedDown.setLayoutY(80);
		speedUp.setOnKeyPressed(new speedUpHandler());
		speedDown.setOnKeyPressed( e->{
			if ( e.getCode() == KeyCode.DOWN)
				speedDown();
		});
	}

	public void play() {
		animation.play();
	}
	
	public void pause() {
		animation.pause();
	}

	public void stop() {
		animation.stop();
	}
	
	private class moveBallHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent e) {
			moveBall();
		}
	}
	
	protected void moveBall() {
		if ( x< this.radius || x > this.getWidth() - radius )
			dx *= -1;//change ball direction
		if ( y < this.radius || y > this.getHeight() -radius) {
			dy *= -1;
		}
		
		this.x += dx;
		this.y += dy;
		circle.setCenterX(x);
		circle.setCenterY(y);
	}
	
	private class speedUpHandler implements EventHandler<KeyEvent>{
		@Override
		public void handle(KeyEvent e) {
			if ( e.getCode() == KeyCode.UP)
				speedUp();
		}
	}

	public void speedUp() {
			animation.setRate(animation.getRate() + 0.1);
	}
	
	private void speedDown() {
		if (animation.getRate()> 0 )
			animation.setRate(animation.getRate() - 0.1);
	}
	
	class  MousePressedEvent implements EventHandler<MouseEvent>{

		@Override
		public void handle(MouseEvent e) {
			animation.stop();
		}
		
	}
	
	class MouseReleasedEvent implements EventHandler<MouseEvent>{

		@Override
		public void handle(MouseEvent arg0) {
			animation.play();
		}
		
	}

}
