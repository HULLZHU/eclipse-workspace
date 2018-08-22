package Chapter;

public class Listing_07_02 {

	public static void main(String[] args) {
		int[] deck = new int [52];
		for ( int i = 0; i < 52; i++) {
			deck[i] =i;
		}
	    shuffleCard (deck);
	    System.out.println("The first 4 numbers are");
	    for ( int i =0; i < 4; i++) 
	    {
	    System.out.print(cardRank(deck[i])+" ");
	    cardSuit(deck[i]);
	    System.out.println("");
	    }
	}
	public static String cardRank(int i) {
		String[] suitName = {"Spade","Hearts","Diamond","Clubs"};
		if ( i/13 == 0)
			return suitName[0];
		else if ( i/13 == 1)
			return suitName[1];
		else if ( i/13 ==2)
			return suitName[2];
		else if (i/13 == 3)
			return suitName[3];
		else 
			return "Wrong suitName";
		// TODO Auto-generated method stub
	}

	public static void cardSuit( int i) {
		if ( i % 13 == 0){
			System.out.print("ACE");
		}
		else if ( i % 13 == 1){
			System.out.print("2");
		}
		else if ( i%13 >=10) {
			switch ( i%13) {
			case 10 : System.out.print("Jack");
			break;
			case 11 : System.out.print("Queen");
			break;
			case 12 : System.out.print("King");
			break;
			}
		}
		else 
			System.out.print(i%13);
	}

	public static int[] shuffleCard(int[] deck) {
		for( int count = 0, i=0, j = 0,temp = 0; count < 10*deck.length; count ++) {
			i = (int)( 52 *Math.random());
			j = (int)( 52 *Math.random());
			temp =deck[j] ;
			deck[j] = deck[i];
			deck[i] = temp ;
		}
		return deck;
	}

}
