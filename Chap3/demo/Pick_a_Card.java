package demo;

import java.util.*;

public class Pick_a_Card {

	public static void main(String[] args) {
		
		System.out.println("Now pick a card from a deck of 52 cards" );
		
		int card = (int) (13*Math.random());
		
		int suit = (int)( 4*Math.random());
		
		if (suit== 0)
				{
			System.out.print(" Your card is Clubs");
				}
		if ( suit == 1)
		        {
			System.out.print("Your card is Diamonds");
		        }
		if ( suit ==2)
		       {
			System.out.print("Your card is Hearts");
		       }
		if ( suit ==3 )
		       {
			 System.out.print(" Your card is Spades");
		       }
		
		      
		if ( card != 1 && card !=11 && card != 12 && card!=13)
		{
	         System.out.print(" "+ card);
		}
		
		if ( card == 1)
		{
			System.out.println(" ACE");
		}
		
		if (card ==11)
		{
			System.out.println(" J");
		}
		if ( card ==12)
		{
			System.out.println(" O");
		}
		if (card == 13)
		{
			System.out.println(" K");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}