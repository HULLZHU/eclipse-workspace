import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class CardMachine extends BorderPane{
	private HBox cardBox= new HBox ();
	private TextField tfNumberOfCard = new TextField("4");
	private Button refreshButton = new Button("Refresh");
	private int numberOfCard;
	private int indexOfCard[];
	
	public CardMachine() throws Exception {
		this.setTop(cardBox);
		this.setBottom(refreshButton);
		this.setCenter(tfNumberOfCard);
		try {
			numberOfCard = Integer.parseInt(tfNumberOfCard.getText());
			indexOfCard= new int[numberOfCard];
		}
		catch (Exception e) {
			throw new  Exception("Please make sure you input an valid number");
		}
		setButton();
	}

	private void setButton() {
		refreshButton.setOnAction(new refreshHandler());
		
	}
	
	class refreshHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			//get the cards' indices
			indexOfCard = getRandomNumber();
			printCards();
		}
		
	}

	public int[] getRandomNumber() {
		int[] randomNumbers = new int[indexOfCard.length];
		for ( int i = 0 ; i < randomNumbers.length ; i ++ ) {
			randomNumbers[i] = 1 + (int)(54*Math.random());
		}
		return randomNumbers;
	}

	public void printCards() {
		for (int i = 0; i <indexOfCard.length; i++ ) {
			String fileName = ("file:image/card/"+indexOfCard[i]+".png");
			ImageView imageView = new ImageView(fileName);
			cardBox.getChildren().add(imageView);
		}
		
	}
	

}
