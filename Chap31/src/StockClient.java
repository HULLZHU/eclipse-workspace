import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StockClient extends Application {
	
 
	private TextField tfPrice = new TextField() ;
	private TextField tfVolume = new TextField();
	private TextField tfVolatility = new TextField();
	private static int  index = 0;
	private static int length = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		//layout of the GUI
		GridPane gridPane = new GridPane();
		Label lbPrice = new Label("Price",tfPrice);
		Label lbVolume = new Label("Volume",tfVolume);
		Label lbVolitality = new Label("Volatility",tfVolatility);
		gridPane.add(lbPrice, 0, 0);
		gridPane.add(lbVolume, 0, 1);
		gridPane.add(lbVolitality, 0, 2);
		HBox hbox = new HBox(10);
		Button btAdd = new Button("Add");
		Button btFirst = new Button("First");
		Button btNext = new Button("Next"); 
		Button btPrevious = new Button("Previous");
		Button btLast = new Button("Last");
		hbox.getChildren().addAll(btAdd,btFirst,btNext,btPrevious,btLast);
		BorderPane pane = new BorderPane();
		pane.setTop(gridPane);
		pane.setBottom(hbox);  
		
		Scene scene = new Scene(pane);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene); 
		
		//Socket socket = new Socket("localhost",8000); 
		
		btAdd.setOnAction(new AddEvent()); 
		btFirst.setOnAction(new FirstEvent());
		btNext.setOnAction(new NextEvent());
		btPrevious.setOnAction(new PreviousEvent());
		btLast.setOnAction(new LastEvent());
		
		primaryStage.show();
		
	}  
	/**AddEvent*/
	private class AddEvent implements EventHandler<ActionEvent> {
		private DataOutputStream requestToServer;
		private ObjectOutputStream toServer ;
		
		@Override
		public void handle(ActionEvent e) {
			double price = Double.parseDouble(tfPrice.getText());
			double volume = Double.parseDouble(tfVolume.getText());
			double volatility = Double.parseDouble(tfVolatility.getText());
			Stock stock = new Stock(price,volume,volatility);
		    try {
		    	Socket socket = new Socket("localhost",8000);
		    	
		    	requestToServer = new DataOutputStream(socket.getOutputStream());
		    	requestToServer.writeInt(0);
				requestToServer.writeInt(0);
		    	
				toServer = new ObjectOutputStream(socket.getOutputStream());
				toServer.writeObject(stock);
				
				System.out.println("You successfully add one stock");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}
	
	
	/**FirstEvent*/ 
	private class FirstEvent implements EventHandler<ActionEvent>{
		private DataOutputStream toServer;
		private ObjectInputStream fromServer;
 
		@Override
		
		public void handle(ActionEvent e) {
			try {
				Socket socket = new Socket("localhost",8000);
				
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeInt(1);
				index = 0;
				toServer.writeInt(index);
				
				fromServer = new ObjectInputStream(socket.getInputStream());
				Stock stock = (Stock) fromServer.readObject();  
				
				displayStock(stock);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}	
	}
	/**NextEvent*/
	private class NextEvent implements EventHandler<ActionEvent>{
		private DataOutputStream toServer;
		private ObjectInputStream fromServer;

		@Override 
		public void handle(ActionEvent event) {
			try { 
				Socket socket = new Socket("localhost",8000);
				
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeInt(2);
				index ++;
				toServer.writeInt(index); 
				
				fromServer = new ObjectInputStream(socket.getInputStream());
				Stock stock = (Stock)fromServer.readObject();
				
				displayStock(stock);
			} catch (IOException e1) { 
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}	
		}	
	}   
	/**PreviousEvent*/
	private class PreviousEvent implements EventHandler<ActionEvent>{
		private DataOutputStream toServer;
		private ObjectInputStream fromServer;

		@Override
		public void handle(ActionEvent event) { 
			try {
				if(index >= 1) {
				Socket socket = new Socket("localhost",8000);
				
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeInt(3);
				index --;  
				toServer.writeInt(index);
				System.out.println("The index is "+ index);
				fromServer = new ObjectInputStream(socket.getInputStream());
				Stock stock = (Stock) fromServer.readObject();
				displayStock(stock);
				}
				else {
					System.out.println("No available stock");
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception ex) {
				System.out.println("Something goes run");
			}
		}	
	}
	
	/**LastEvent*/
	private class LastEvent implements EventHandler<ActionEvent>{
		private DataOutputStream toServer;
		private ObjectInputStream fromServer;

		@Override
		public void handle(ActionEvent event) {  
			try { 
				Socket socket = new Socket("localhost",8000);
				
				toServer = new DataOutputStream(socket.getOutputStream());
				toServer.writeInt(4);
				toServer.writeInt(-1);
				
				fromServer = new ObjectInputStream(socket.getInputStream());
				Stock stock = (Stock) fromServer.readObject();
				index = new DataInputStream(socket.getInputStream()).readInt();
				length = index+1;
				displayStock(stock);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace(); 
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception ex) {
				System.out.println("Something goes wrong");
			}
		}	 
	} 

	public void displayStock(Stock stock) {
		if (stock.getVolume() == 999 &&stock.getPrice()==999 &&stock.getVolatility()== 999) {
			tfPrice.setText("Null");
			tfVolatility.setText("Null");
			tfVolume.setText("Null");
		}
		else { 
			Platform.runLater(() ->{
			tfPrice.setText(stock.getPrice()+"");
			tfVolatility.setText(stock.getVolatility()+"");
			tfVolume.setText(stock.getVolume()+"");
		});
			}
		
	}
		
}
