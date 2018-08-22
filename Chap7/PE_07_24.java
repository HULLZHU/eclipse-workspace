
public class PE_07_24 {

	public static void main(String[] args) {
		//generate an ordered deck of cards
		int [] cards = new int[52];
		for ( int i = 0 ; i < cards.length; i ++ ) {
			cards[i] = i + 1;
		}
		//shuffle the card
		final int shuffleTimes = 100;
		int swappedCard1 = 0;
		int swappedCard2 = 0;
		for ( int i = 0 ; i < shuffleTimes; i ++ ) {
			swappedCard1 = (int)(52*Math.random());
			swappedCard2 = (int)(52*Math.random());
			swapCards(swappedCard1,swappedCard2,cards);
		}
		//¿¨Æ¬title¼ÆÊý
		int[] titleCount = { 0, 0, 0, 0};
		
		String Spades = "";
		String Clubs = "";
		String Hearts = "";
		String Diamond = "";
		while ( titleCount[0]==0 || titleCount[1]==0||titleCount[2]==0||titleCount[3]==0) {
			//get a random card
			int randomIndex = (int) (52*Math.random());
			if ( cards[randomIndex]<=13 && cards[randomIndex]>=1) {
				titleCount[0]++;
	            Spades = getCardName(cards[randomIndex]);
			}
			if ( cards[randomIndex]>=14&& cards[randomIndex]<=26) {
				titleCount[1]++;
				Clubs = getCardName(cards[randomIndex]);
			}
			if ( cards[randomIndex]>=27&& cards[randomIndex]<=39) {
				titleCount[2]++;
				Hearts = getCardName(cards[randomIndex]);
			}
			if ( cards[randomIndex]>=40&& cards[randomIndex]<=52) {
				titleCount[3]++;
				Diamond = getCardName(cards[randomIndex]);
			}
		}
		
		System.out.println(Spades);
		System.out.println(Clubs);
		System.out.println(Hearts);
		System.out.println(Diamond);
		System.out.println("CountNumber"+ (titleCount[0]+ titleCount[1]+titleCount[2]+titleCount[3]));
	}

	private static String getCardName(int i) {
		String cardName = "";
		if( i <=13 && i >=1) {
			cardName = "Spades" + i;
		}
		else if ( i >= 14 && i <=26)
			cardName = "Clubs" + i%13;
		else if ( i >=27 && i<=39) 
			cardName = "Heart" + i %13;
		else 
			cardName = "Diamond" + i %13;
		
		return cardName;
	}

	private static void swapCards(int i, int j, int[] cards) {
		int temp = cards[i];
		cards[i] = cards[j];
		cards[j] = temp;
		
	}

}
