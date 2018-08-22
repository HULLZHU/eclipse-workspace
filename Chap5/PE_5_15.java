
public class PE_5_15 {

	public static void main(String[] args) {
		System.out.println("This exercise is about ASCII code ordering");
		
		int number = '!';
		
		while ( number <= '~')
		{
			if ( (number-'!')%10==0 )
			{
				System.out.println("");
				System.out.print(" " + (char)number);
			}
			else
				System.out.print(" " + (char)number);
			number++;
		}
		
		// TODO Auto-generated method stub

	}

}
