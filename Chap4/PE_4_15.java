import java.util.Scanner;

public class PE_4_15 {

	public static void main(String[] args) {
		
		System.out.println("Please input a letter");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		char letter = s1.charAt(0);
		
		if ( (letter<='C'&& letter>='A')||(letter<='c'&&letter>='a'))
			System.out.println("The corresponding number is 2");
		else if ( (letter<='F'&&letter>='D')||(letter>='d'&&letter<='f'))
			System.out.println("The corresponding number is 3");
		else if ( (letter<='i'&&letter>='g')||(letter<='I'&&letter>='G'))
			System.out.println("The corresponding number is 4");
		else if ( (letter<='l'&&letter>='j')||(letter<='L'&&letter>='J'))
			System.out.println("The corresponding number is 5");
		else if ( (letter>='m'&&letter<='o')||(letter>='M'&&letter<='N'))
			System.out.println("The corresponding number is 6");
		else if ( (letter>='p' && letter<='s')||(letter>='P'&&letter<='S'))
			System.out.println("The corresponding number is 7");
		else if ( (letter>='t'&&letter<='v')||(letter>='T'&&letter<='V'))
			System.out.println("The corresponding number is 8");
		else if ( (letter>='w')&&letter<='z'||letter>='W'&&letter<='Z')
			System.out.println("The corresponding number is 9");
		
		else if (letter == '+'|| letter =='*')
			System.out.println("The corresponding number is +");
		else if (letter ==' ')
			System.out.println("The corresponding number is whitespace");
		else if (letter == '#')
			System.out.println("The corresponding number is #");
		else
			{System.out.println("Please input another valid number");}
		
		
		// TODO Auto-generated method stub

	}

}
