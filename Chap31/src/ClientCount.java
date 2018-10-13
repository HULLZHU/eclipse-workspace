import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ClientCount extends Application {
	private TextArea ta = new TextArea();
	
	public static void main(String[]args) {
		launch(args);
	} 

	@Override
	public void start(Stage primaryStage) throws Exception {
		ScrollPane pane = new ScrollPane(ta);
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		Runnable clientProcess = new ClientProcess();
		Thread thread = new Thread(clientProcess);
		
		thread.start();
		primaryStage.show();
	} 
	

	private class ClientProcess implements Runnable{
		private DataInputStream fromServer;
		private int count;
		@Override
		public void run() {
			try {
				Socket socket = new Socket("localhost",8000);
				fromServer = new DataInputStream(socket.getInputStream());
				count = fromServer.readInt();
				Platform.runLater(() ->{
					ta.appendText("You are the "+ count + " th user");
				});
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
