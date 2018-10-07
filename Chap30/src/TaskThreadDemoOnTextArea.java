

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class TaskThreadDemoOnTextArea extends Application{
	private StackPane pane = new StackPane();
	private TextArea txArea = new TextArea();

	

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.getChildren().add(txArea);
		
		Runnable printA = new PrintChar('a',100);
		Runnable printB = new PrintChar('b',100);
		Runnable print100 = new PrintNum(100,100);
		
		Thread threadA = new Thread(printA);
		Thread threadB = new Thread(printB);
		Thread threadC = new Thread(print100); 
		
		threadA.start();
		threadB.start();
		threadC.start();
	
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(new Thread(printA));
		executor.execute(new Thread(printB));
		executor.execute(new Thread(print100));
		executor.shutdown(); 
	}
	
	
	
	private class PrintChar implements Runnable{
		private int time = 0;
		private char character = 'a';
		
		PrintChar(char character, int time){
			this.time = time;
			this.character = character;
		}
		

		@Override
		public void run() {
			for ( int i = 0 ; i < time ;i ++) {
				txArea.appendText(character+"");
				if(i % 10== 0)
					txArea.appendText("\n");
			}
			
		}
		
	} 
	
	private class PrintNum implements Runnable{
		private int time = 0;
		private int num = 0;
		
		PrintNum(int num, int time){
			this.num = num;
			this.time = time;
		}
		

		@Override
		public void run() {
			for ( int i = 0 ; i < time; i ++ ) {
				txArea.appendText(num + "");
				if ( i % 10 == 0)
					txArea.appendText("\n");
				}
		} 
		
	}
	
	public static void main(String[]args) {
		launch(args);
	}

}
