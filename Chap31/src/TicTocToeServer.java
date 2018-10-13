import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class TicTocToeServer extends Application  implements TicTocToeConstants{
	
	private int sessionNo = 1;//Number a session
	private TextArea taLog= new TextArea();
	
	@Override
	public void start(Stage primaryStage) {
		
		
		Scene scene = new Scene(new ScrollPane(taLog));
		primaryStage.setScene(scene);
		primaryStage.setTitle("TicTocToeServer");
		primaryStage.show();
		Thread thread = new Thread(new MyServerSocketThread());
		thread.run();
	}
	
	private class MyServerSocketThread implements Runnable{

		@Override
		public void run() { 
			try {
				ServerSocket server = new ServerSocket(8000);
				Platform.runLater(() ->taLog.appendText(new Date()+": server started"));
				
				while ( true ) {
					//player1 join 
					Socket player1 = server.accept();
					Platform.runLater(() ->taLog.appendText("Player 1:"+player1.getInetAddress().getHostAddress() +" Join the Game at "
							+ new Date()));
					         
					new DataOutputStream(player1.getOutputStream()).writeInt(PLAYER1);;
					
					//player2 join
					Socket player2 = server.accept();
					Platform.runLater(() ->taLog.appendText("Player 2:"+player2.getInetAddress().getHostAddress() +" Join the Game at "
							+ new Date()));
					
					
					new DataOutputStream(player2.getOutputStream()).writeInt(PLAYER2);
					
					Platform.runLater(()->{
						taLog.appendText("Start a thread for session "+sessionNo ++ +'\n');
					});
					//remember player1 and player2 are socket
					Thread thread = new Thread(new HandleASession(player1,player2));
					thread.run();
				}
				
			}
			catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	private class HandleASession implements Runnable{
		//create 2 sockets to get input and run output
		private Socket player1;
		private Socket player2;
		//create and initialize cells
		private char[][] cell = new char[3][3];
		private DataInputStream fromPlayer1;
		private DataInputStream fromPlayer2;
		private DataOutputStream toPlayer1;
		private DataOutputStream toPlayer2;
		
		private boolean continueToPlay = true;
		/** constructor*/ 
		public HandleASession(Socket player1, Socket player2) {
			this.player1 = player1;
			this.player2 = player2;
			
			//initialize the cell
			for ( int i = 0; i < cell.length ; i ++ ) {
				for ( int j = 0 ; j < cell.length ; j ++ ) {
					cell[i][j] = ' ';
				}
			}
		}

		@Override
		public void run() {
			try {
				fromPlayer1 = new DataInputStream(player1.getInputStream());
				fromPlayer2 = new DataInputStream(player2.getInputStream());
				toPlayer1 = new DataOutputStream(player1.getOutputStream());
				toPlayer2 = new DataOutputStream(player2.getOutputStream());
				
				//write any thing to tell player1 to start
				toPlayer1.writeInt(1);
				
				while ( true ) {
					int row = fromPlayer1.readInt();
					int column = fromPlayer1.readInt();
					cell[row][column] = 'X';
					
					//before the next round, judge whether any side wins or not
					if ( isWon('X')) {
						toPlayer1.writeInt(PLAYER1_WON);
						toPlayer2.write(PLAYER1_WON);
						sendMove(toPlayer2,row,column);
						break;
					}
					
					else if (isFull()) {
						toPlayer1.writeInt(DRAW);
						toPlayer2.writeInt(DRAW);
						sendMove(toPlayer2,row,column);
						break;
					}
					else {
						//notify the player2 to take the turn
						sendMove(toPlayer2,row,column);
						toPlayer2.writeInt(CONTINUE);
					}
					
					row = fromPlayer2.readInt();
					column = fromPlayer2.readInt();
					cell[row][column] = 'O';
					//check if player 2 wins
					if (isWon('O')) {
						toPlayer1.writeInt(PLAYER2_WON);
						toPlayer2.writeInt(PLAYER2_WON);
						sendMove(toPlayer1,row,column);
						break;
					}
					//because the player2 is the second turn, so he cannot cause a isFull condition
					else {
						//notify the player1  to continue
						toPlayer1.writeInt(CONTINUE);
						//send player2's selected row and column to player1
						sendMove(toPlayer1,row,column);
					}	
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
		}

		private void sendMove(DataOutputStream toPlayer, int row, int column) throws IOException {
			toPlayer.writeInt(row);
			toPlayer.writeInt(column);
			
		}

		private boolean isFull() {
			for ( int i = 0 ; i < 3; i ++ ) {
				for ( int j = 0 ; j < 3 ; j ++ ) {
					if (cell[i][j] == ' ')
						return false;
				}
			}
			return true;
		}

		private boolean isWon(char token) {
			//check all rows
			for ( int i = 0 ; i < 3; i ++ ) {
				if (cell[i][0]== token&&cell[i][1]==token&&cell[i][2]==token)
					return true;
			}
			
			//check all columns
			for (int j = 0 ; j < 3; j ++ ) {
				if (cell[0][j] == token && cell[1][j] == token && cell[2][j]==token) {
					return true;
				}
			}
			return false; 
		}
		
	}
	
	
	public static void main(String[]args) {
		launch(args);
	}

}
