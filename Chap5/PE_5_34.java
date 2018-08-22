import java.util.*;
public class PE_5_34 {

	public static void main(String[] args) {
		
		System.out.println("Please input your choice: scissor, rock and paper");
		
		Scanner input = new Scanner(System.in);
		
		String guess = "";//define user's input

		int countPC = 0;
		int countPlayer = 0;
		
		int randomTemp = 0;
		
		while ( countPlayer - countPC <=2) {
			guess = input.next();
			randomTemp = (int)(3*Math.random());
			if (randomTemp==0) {
				System.out.println("The PC's response is scissor");
				if ( guess.equals("scissor")){
					System.out.println("Draw");
				}
				else if ( guess.equals("rock")) {
					System.out.println("You win");
					countPlayer ++;
				}
				else if ( guess.equals("paper")) {
					System.out.println("You lose");
					countPC ++;
				}
				else {
					System.out.println("Please input again");
					continue;
				}
			}
			else if (randomTemp == 1) {
				System.out.println("The PC's response is rock");
				if ( guess.equals("scissor")) {
					System.out.println("You lose");
					countPC++;
				}
				else if ( guess.equals("rock")) {
					System.out.println("Draw");
				}
				else if ( guess.equals("paper")) {
					System.out.println("You win");
					countPC++;
				}
				else {
					System.out.println("Please input again");
					continue;
				}
			}
			else if (randomTemp == 2) {
				System.out.println("The PC's response is paper");
				if ( guess.equals("scissor")) {
					System.out.print("You win");
					countPlayer++;				
					}
				else if ( guess.equals("rock")) {
					System.out.println("You lose");
					countPC++;
				}
				else if ( guess.equals("paper")) {
					System.out.println("Draw");
				}
				else {
					System.out.println("Please input again");
				}
			}
		}
		System.out.print("Game End");
		// TODO Auto-generated method stub

	}

}
