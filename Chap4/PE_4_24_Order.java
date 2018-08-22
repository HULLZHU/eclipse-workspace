import java.util.Scanner;

public class PE_4_24_Order {

	public static void main(String[] args) {
		
		System.out.println("Please input three cities");
		
		Scanner input = new Scanner(System.in);
		
		String c1 = input.nextLine();
		
		String c2 = input.nextLine();
		
		String c3 = input.nextLine();
		
		String c ="0";
		
		if ( c1.compareTo(c2)>0)
		{
			c=c1;
			
			c1=c2;
			
			c2 =c ;
		}
		
		if (c2.compareTo(c3)>0)
		{
			c= c2;
			
			c2 = c3;
			
			c3 = c;
		}
		
		if ( c1.compareTo(c2)>0)
		{
			c=c1;
			
			c1=c2;
			
			c2 =c ;
		}		
		
		System.out.println("These three cities in asencding order are" + c1 +"\n" +c2 +"\n"+ c3);
		
		// TODO Auto-generated method stub

	}

}
