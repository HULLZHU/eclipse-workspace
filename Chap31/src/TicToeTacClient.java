import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TicToeTacClient extends Application implements TicTocToeConstants {
	private boolean myTurn = false;
	private char myToken=' ';
	private char otherToken = ' ';
	private Cell[][] cell = new Cell[3][3];
	private Label lblTitle = new Label();
	private Label lblStatus = new Label();
	//Indicate selected row and column by the current move
	private int rowSelected;
	private int columnSelected;
	//create input and output streams to/from server
	private DataInputStream fromServer;
	private DataOutputStream toServer;
	
	
	//Input and Output streams from/to server
	private boolean continueToPlay = true;
	//wait for the player to mark a cell
	private boolean waiting = true;
	//host name or IP
	private String host = "localhost";
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		for (int i = 0 ; i < 3; i ++ ) {
			for ( int j = 0 ; j < 3; j ++ )
				pane.add(cell[i][j]=new Cell(i,j),j,i);
		}
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(lblTitle);
		borderPane.setCenter(pane);
		borderPane.setBottom(lblStatus);
		 
		
		Scene scene = new Scene(borderPane,320,350);
		primaryStage.setTitle("TicTocToeClient");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		connectToServer();

	}

	private void connectToServer() {
		try {
			//create a socket to connect to the server
			Socket socket = new Socket(host,8000);
			
			//create an input / to stream to receive / output data from / to the server
			fromServer = new DataInputStream(socket.getInputStream());
			toServer = new DataOutputStream(socket.getOutputStream());
			ControlTheGameThread controlGameThread = new ControlTheGameThread();
			Thread thread = new Thread(controlGameThread);
			thread.run();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	
	//control the game on a separate thread
	class ControlTheGameThread implements Runnable{
	
		@Override
		public void run() {
			try {
				int player = fromServer.readInt();
				if ( player == PLAYER1) {
					myToken = 'X';
					otherToken = 'O';
					Platform.runLater(()->{
						lblTitle.setText("Player 1 with token 'X");
						lblStatus.setText("Waiting for player2 to join");
					});
					
				//receive startup notification from the server
					fromServer.readInt();
				//The other player has joined
					Platform.runLater(()->{
						lblStatus.setText("Player 2 has joined. I start first");
					});
					
					//It is my turn
					myTurn = true;
				}
				
				else if ( player == PLAYER2) {
					myToken ='O';
					otherToken = 'X';
					
					Platform.runLater(()->{
						lblTitle.setText("Player 2 with the token 'O'");
						lblStatus.setText("Waiting for player1 to move");
					});
				}
				
				while (continueToPlay) {
					if (player == PLAYER1) {
						waitForPlayerAction();
						sendMove();
						receiveInfoFromServer();
					}
					else if (player == PLAYER2) {
						receiveInfoFromServer();
						waitForPlayerAction();
						sendMove();
					
					}
				}
				
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	
		private void receiveInfoFromServer() throws IOException {
			int status = fromServer.readInt();
			
			if ( status == PLAYER1_WON) {
				continueToPlay = false;
				if ( myToken == 'X') {
					Platform.runLater(()->{
						lblStatus.setText("I won ! (X)");
					});
				}
				else if ( myToken =='O') {
					Platform.runLater(() ->{
						lblStatus.setText("Player 1 Won(X)");
					});
					receiveMove();
				}
			}
			
			else if (status == PLAYER2_WON) {
				continueToPlay = false;
				if (myToken == 'O') {
					Platform.runLater(()->{
						lblStatus.setText("I won (O)");
					});
				}
				else if (myToken =='X') {
					Platform.runLater(()->{
						lblStatus.setText("Player 2 (O) has won !");
					});
					receiveMove();
				}
			}
			
			else if ( status == DRAW ) {
				
				continueToPlay =false;
				Platform.runLater( ()->{
					lblStatus.setText("Game Over, NO winner");
				});
				
				if (myToken == 'O') {
					receiveMove();
				}
			}
			
			else {
				receiveMove();
				Platform.runLater(() ->{
					lblStatus.setText("MyTurn");
				});
				myTurn = true;
			}
			
		
			
		}
	
		private void receiveMove() throws IOException {
			int row = fromServer.readInt();
			int column = fromServer.readInt();
			Platform.runLater(() -> cell[row][column].setToken(otherToken));
			
		}

		private void sendMove() throws IOException {
			toServer.writeInt(rowSelected);
			toServer.writeInt(columnSelected);
			
		}
	
		private void waitForPlayerAction() throws InterruptedException {
			while (waiting) {
				Thread.sleep(100);
			}
			waiting = true;
		}
		
	}

	public static void main(String[]args) {
		launch(args);
	}
	
	public class Cell extends Pane{
		private int row; 
		private int column;
		
		//token used for this cell
		private char token = ' ';
		
		public Cell(int row, int column) {
			this.row = row;
			this.column = column;
			this.setPrefSize(2000,2000);
			this.setStyle("-fx-border-color:black");
			this.setOnMouseClicked(e ->handleMouseClick());
		}

		private void handleMouseClick() {
			if ( token == ' ' && myTurn) {
				setToken(myToken);
				myTurn = false;
				rowSelected = row;
				columnSelected = column;
				lblStatus.setText("Waiting for the other player to move");
				waiting =false;
			}
		}
		
		public char getToken() {
			return token;
		}
		
		public void setToken(char c) {
			token = c;
			repaint();
		}

		protected void repaint() {
			if ( token == 'X') {
				Line line1 = new Line(10,10,this.getWidth()-10,this.getHeight()-10);
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				Line line2 = new Line(10,this.getHeight()-10,this.getWidth()-10,10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));
				
				this.getChildren().addAll(line1,line2);
			}
			
			else if ( token == 'O') {
				Ellipse ellipse = new Ellipse(this.getWidth()/2,this.getHeight()/2,this.getWidth()/2-10,this.getHeight()/2 -10);
				ellipse.centerXProperty().bind(this.widthProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2));
				ellipse.centerYProperty().bind(this.heightProperty().divide(2).subtract(10));
				ellipse.centerXProperty().bind(this.widthProperty().subtract(10));
				
				ellipse.setStroke(Color.BLACK);
				ellipse.setFill(Color.WHITE);
				
				this.getChildren().add(ellipse);
			}
			
		}
	}
}
