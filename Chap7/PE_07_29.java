
public class PE_07_29 {

	public static void main(String[] args) {
		int[] deck = new int[52];
		for ( int i = 0; i < deck.length;i++) {
			deck[i]= i + 1;
		}
		 
		for (int sum = 0 ; sum != 24;) {
		    sum = 0;
			int [] pickedCards = new int[4];
			for ( int i = 0; i < pickedCards.length;i++ ) {
				for ( int j = 0; j<pickedCards.length;j++) {
					pickedCards[i] = deck[(int)(52*Math.random())];
					if ( i != j ) {
					if ( pickedCards[i] == pickedCards[j]) {
						pickedCards[i] = deck[(int)(52*Math.random())];
						j = 0;
					}
					}
					else 
						continue;
			}
		
		}
			for ( int i = 0; i < pickedCards.length; i++) {
				System.out.println("The card you pick is " + getCardName(pickedCards[i]));
			}

            for ( int i = 0 ; i < pickedCards.length;i++) {
            	sum = sum + (pickedCards[i]-1)%13+1;
            }
            System.out.println("The sum is " + sum );
       

	}

}

	private static String getCardName(int i) {
		String cardName = "";
		if( i <=13 && i >=1) {
			cardName = "Spades" + ((i-1)%13 + 1);
		}
		else if ( i >= 14 && i <=26)
			cardName = "Clubs" + ((i-1)%13 + 1);
		else if ( i >=27 && i<=39) 
			cardName = "Heart" + ((i-1)%13 + 1);
		else 
			cardName = "Diamond" + ((i-1)%13 + 1);
		
		return cardName;
		// TODO Auto-generated method stub
	}
}