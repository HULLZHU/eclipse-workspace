import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.*;
public class DisplayThreeCards extends Application{
	public static void main(String args[]) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//create and set pane
		FlowPane pane = new FlowPane();
		pane.setHgap(5);
		//create and shuttle the cards
	    ArrayList<Integer> cards = new ArrayList<>();
		for ( int i = 1 ; i <= 52; i ++ ) {
			cards.add(i);
		}
		shuttle(cards);
		
		
		//get the first 3 cards and then print them
		for ( int i = 0; i < 52 ; i++ ) {
			String imageName = cards.get(i)+".png";
			String directory = "file:image/card/"+imageName;
			ImageView imageView = new ImageView(directory);
			
			pane.getChildren().add(imageView);
		}
		//define scene and show it on stage
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void shuttle(ArrayList<Integer> cards) {
		for ( int count = 0; count <= 200; count ++ ) {
			int firstCardIndex = (int)(52*Math.random());
			int secondCardIndex = (int)(52*Math.random());
			int firstCard = cards.get(firstCardIndex);
			cards.set(firstCardIndex, cards.get(secondCardIndex));
			cards.set(secondCardIndex, firstCard);
		}
	}

}