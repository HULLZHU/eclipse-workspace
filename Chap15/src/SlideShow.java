import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SlideShow extends Application{
	private StackPane pane = new StackPane();
	private int index = 0;
	private String imageName = "slide0.jpg";
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ImageView image = new ImageView("file:C:/Users/yuan/eclipse-workspace/Chap15/image/"+imageName);
		pane.getChildren().add(image);
		
		EventHandler<ActionEvent> changeImage  = e ->{
			pane.getChildren().clear();
			if(index <= 24) 
			{
				String imageName = "slide"+index+".jpg";
				ImageView imageView = new ImageView("file:C:/Users/yuan/eclipse-workspace/Chap15/image/"+imageName);
				pane.getChildren().add(imageView);
				index ++ ;
			}
			else
			{
				index = 0;
				String imageName = "slide"+index+".jpg";
				ImageView imageView = new ImageView("file:C:/Users/yuan/eclipse-workspace/Chap15/image/"+imageName);
				pane.getChildren().add(imageView);
				index ++;
			}
		};
		
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(1000),changeImage));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
