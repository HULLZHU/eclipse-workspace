import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class StockServer extends Application{
	
	private static ArrayList<Stock> stocks = new ArrayList<>(); 
	private TextArea ta = new TextArea();
	
	@Override 
	public void start(Stage primaryStage) throws Exception {
		ScrollPane scrollPane = new ScrollPane(ta);
		Scene scene = new Scene(scrollPane);
		 
		Runnable serverProcessor = new ServerProcessor();   
		Thread thread = new Thread(serverProcessor); 
		thread.start();
		primaryStage.setScene( scene );
		primaryStage.show();

	}   
	
	private class ServerProcessor implements Runnable {

		@Override
		public void run() {
			try {
				//create a server socket 
				ServerSocket serverSocket = new ServerSocket(8000);
				//inform user 's successfully logging in
				Platform.runLater(() ->{
					ta.appendText("Hi, Thanks for starting your server !\n " + new Date());
				});
				
				while (true) {
					Socket socket = serverSocket.accept();
					Platform.runLater(()->{
						ta.appendText("One operations happened\n " );
					});
					
					Runnable session = new HandleSession(socket);
					Thread thread = new Thread(session);
					thread.run();
				}
			}
			catch(IOException e) {
				ta.appendText(e.toString());
			}
		} 
	}  
	
	private class HandleSession implements Runnable{
		private Socket socket;
		private DataInputStream fromClient; 
		private ObjectOutputStream stockToClient;
		private ObjectInputStream stockFromClient;
		
		public HandleSession(Socket socket){
			this.socket = socket;
		}
 
		@Override 
		public void run() {  
			try {
				//set the input and output stream
				fromClient = new DataInputStream(socket.getInputStream());
				//control the input and output
				int request = fromClient.readInt(); 
				int index = fromClient.readInt();
				controlRequest(request,index);	
			}
			catch (Exception ex) {  
				ex.printStackTrace();
			} 
		} 

		private void controlRequest(int request, int index) throws IOException {
			
			try { 
				Stock stock ;
                //add a stock
				if (request == 0 ) {
					stockFromClient = new ObjectInputStream(socket.getInputStream());
					//get the stock from the client
					stock = (Stock) stockFromClient.readObject();
					stocks.add(stock);
					
					Platform.runLater(()->{
						ta.appendText("Client tries to add a stock and now the size is "+ stocks.size()+"\n");
					}); 
					stock = stocks.get(index);
				}
				 
				//first request
				
				if ( request == 1) {
					stockToClient = new ObjectOutputStream(socket.getOutputStream());
					
					stock = stocks.get(index);
					Platform.runLater(()->{
						ta.appendText("Client try to access the  first stock");
					}); 
					
					stockToClient.writeObject(stock);
				}
				//next request
				else if ( request == 2) {
					stockToClient = new ObjectOutputStream(socket.getOutputStream());
					Platform.runLater(()->{
						ta.appendText("Client try to access the  next stock");
					}); 
					if ( index <= stocks.size()-1) 
						stock = stocks.get(index);
					else
						stock = new Stock(999,999,999);
					stockToClient.writeObject(stock);
				} 
				
				//previous request 
				else if(request == 3) {
					stockToClient = new ObjectOutputStream(socket.getOutputStream());
					Platform.runLater(()->{
						ta.appendText("Client try to access the  previous stock");
					});
					if (index> 0)
						stock = stocks.get(index); 
					else
						stock = new Stock(999,999,999);
					stockToClient.writeObject(stock);
				} 
				
				 //last request 
				else if (request == 4) {
					stockToClient = new ObjectOutputStream(socket.getOutputStream());
					Platform.runLater(()->{
						ta.appendText("Client try to access the last stock");
					});
					stock = stocks.get(stocks.size() + index);
					stockToClient.writeObject(stock);
					new DataOutputStream(socket.getOutputStream()).writeInt(stocks.size()-1);
				} 
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		} 
	} 
	
	public static void main(String[]args) {
		launch(args);
	}
}