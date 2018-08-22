package demo;

import java.util.*;

public class ScissorRockPaper {

	public static void main(String[] args) {
		
		System.out.println("Input your choice, Scissor:0, Rock:1, Paper :2");

		Scanner input = new Scanner(System.in);
		
		int your_choice = input.nextInt();
		
		int pc_choice = (int) Math.floor((3*Math.random()));
		
		System.out.println("Your computer's answer is "+pc_choice);
		
/////////////////////////////////////////////////////////////////////////		
		if ( your_choice == 0)
		{
			if (pc_choice == 0)
			{
				System.out.println("Draw");
			}
			else if (pc_choice == 1)
			{
				System.out.println("Win");
			}
			else if (pc_choice == 2)
			{
				System.out.println("Lost");
			
		}
		}
/////////////////////////////////////////////////////////////////////////	
		if ( your_choice == 1)
		{
			if (pc_choice == 0)
			{
				System.out.println("Win");
			}
			else if (pc_choice == 1)
			{
				System.out.println("Draw");
			}
			else if (pc_choice == 2)
			{
				System.out.println("Lost");
			}
		}
//////////////////////////////////////////////////////////////////////////		
		if ( your_choice ==2)
			{
			if (pc_choice ==0)
			
			{
				System.out.println("Lost");
			}
			else if (pc_choice == 1)
			{
				System.out.println("Win");
			}
			else if (pc_choice == 2)
			{
				System.out.println("Draw");
			}
		    
		
			}		
		}
		}

	


