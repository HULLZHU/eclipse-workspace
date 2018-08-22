import java.util.*;;

public class Revising_Lottery_Game {

	public static void main(String[] args) {
		System.out.println("Please input a two-digit number");
		
		String lottery = ""+(int)(10*Math.random())+(int)(10*Math.random());
		
		Scanner input = new Scanner(System.in);
		
		String guess = input.nextLine();
		
		if (guess.length()!=2)
		{
			System.out.println("Please input a two-digit number");
			System.exit(1);
		}
		
		char lotteryDigit1 = lottery.charAt(0);
		
		char lotteryDigit2 = lottery.charAt(1);
		
		char guessDigit1 = guess.charAt(0);
		
		char guessDigit2 = guess.charAt(1);
		
		if(guess.equals(lottery))
		{
			System.out.println("Good luck to win 10000 dollars");
		}
		
		else if(
				guessDigit1 == lotteryDigit2&&
				guessDigit2 == lotteryDigit1
				)
		{
			System.out.println("You win 3000 dollars");
		}
		
		else if
			(       guessDigit1 == lotteryDigit1
					||guessDigit1 == lotteryDigit2
					||guessDigit2 == lotteryDigit2
					||guessDigit2 == lotteryDigit1
					)
		{
			System.out.println(" You win 1000 dollars");
		}
		else
		{
			System.out.println("You win nothing");
		}
			
		System.out.println("The lottery number should be" + lottery);			
		
		// TODO Auto-generated method stub

	}

}
