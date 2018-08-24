import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoRectangles extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane pane = new Pane();
		
		System.out.println("Please enter the upper left center coordinates, width and lenghth for the first rectangle.");
		Scanner input = new Scanner(System.in);
		Rectangle rec1 = new Rectangle(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("Now enter the same content of the before one for the second rectangle ");
		Rectangle rec2 = new Rectangle(input.nextDouble(),input.nextDouble(),input.nextDouble(),input.nextDouble());
		rec1.setFill(Color.color(0, 0, 0, 0));
		rec2.setFill(Color.color(0, 0, 0, 0));
		rec1.setStroke(Color.BLACK);
		rec2.setStroke(Color.BLACK);
		
		paintText(rec1,rec2,pane);
		
		pane.getChildren().addAll(rec1,rec2);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	private void paintText(Rectangle rec1, Rectangle rec2,Pane pane) {
		double[][] rec1Points = {
				{rec1.getX(),rec1.getY()},
				{rec1.getX()+rec1.getWidth(),rec1.getY()},
				{rec1.getX()+rec1.getWidth(),rec1.getY()+rec1.getHeight()},
				{rec1.getX(),rec1.getY()+rec1.getHeight()}
		};
		double[][] rec2points = {
				{rec1.getX(),rec1.getY()},
				{rec1.getX()+rec1.getWidth(),rec1.getY()},
				{rec1.getX()+rec1.getWidth(),rec1.getY()+rec1.getHeight()},
				{rec1.getX(),rec1.getY()+rec1.getHeight()}
		};
		//initiate overlapped status
		boolean overlapped = false;
		for ( int i = 0; i < 4; i ++ ) {
			if(rec1.contains(rec2points[i][0], rec2points[i][1])){
				overlapped = true;
				break;
			}
			if(rec2.contains(rec1Points[i][0], rec1Points[i][1])){
				overlapped = true;	
				break;
				}
		}
		
		Text text = new Text();
		if( overlapped )
			text = new Text(0.5*rec1.getX()+0.5*rec2.getX(),0.5*rec1.getY()+0.5*rec2.getY(),"Overlapped");
		else
			text = new Text(0.5*rec1.getX()+0.5*rec2.getX(),0.5*rec1.getY()+0.5*rec2.getY(),"Not OverLapped");
		pane.getChildren().add(text);
			
	}
}