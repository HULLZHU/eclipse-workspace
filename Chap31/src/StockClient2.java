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

public class StockClient2 extends Application {
	
	private TextField tfPrice = new TextField() ;
	private TextField tfVolume = new TextField();
	private TextField tfVolatility = new TextField();
	
	private DataOutputStream requestToServer;
	private ObjectInputStream stockFromServer;
	private ObjectOutputStream stockToServer ;
	
	public static void main(String[] args) {
		launch(args);
	}
 
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*Runnable controlSocket = new ControlSocket();
		Thread thread = new Thread(controlSocket);
		thread.start();*/
		
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
		
		Socket socket = new Socket("localhost",8000); 
		requestToServer = new DataOutputStream(socket.getOutputStream());
		stockFromServer = new ObjectInputStream(socket.getInputStream());
		stockToServer = new ObjectOutputStream(socket.getOutputStream());
		
		Scene scene = new Scene(pane);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene); 
		primaryStage.show();
		
		btAdd.setOnAction(new AddEvent());
		btFirst.setOnAction(new FirstEvent());
		btNext.setOnAction(new NextEvent());
		btPrevious.setOnAction(new PreviousEvent());
		btLast.setOnAction(new LastEvent());
		
		
		
	} 
	
	private class ControlSocket implements Runnable{

		@Override
		public void run() {
			try {
				Socket socket = new Socket("localhost",8000); 
				requestToServer = new DataOutputStream(socket.getOutputStream());
				stockFromServer = new ObjectInputStream(socket.getInputStream());
				stockToServer = new ObjectOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			//set streams	
		}
	}
	
	
	/**AddEvent*/
	private class AddEvent implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent e) {
			double price = Double.parseDouble(tfPrice.getText());
			double volume = Double.parseDouble(tfVolume.getText());
			double volatility = Double.parseDouble(tfVolatility.getText());
			Stock stock = new Stock(price,volume,volatility);
		    try {
		    
		    	requestToServer.writeInt(0);
				stockToServer.writeObject(stock);
				
				System.out.println("You successfully add one stock");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
	
	/**FirstEvent*/ 
	private class FirstEvent implements EventHandler<ActionEvent>{
		@Override
		
		public void handle(ActionEvent e) {
			try {
				
				requestToServer.writeInt(1);
				
				Stock stock = (Stock) stockFromServer.readObject();  
				
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

		@Override 
		public void handle(ActionEvent event) {
			try { 
				
				requestToServer.writeInt(2);
				
				Stock stock = (Stock)stockFromServer.readObject();
				
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
		@Override
		public void handle(ActionEvent event) {
			try {
				requestToServer.writeInt(3);
				Stock stock = (Stock) stockFromServer.readObject();
				
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
	/**LastEvent*/
	private class LastEvent implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			try { 
				requestToServer.writeInt(4);
			
				Stock stock = (Stock) stockFromServer.readObject();
				
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

