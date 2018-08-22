
public class Demo_5_25_A {

	public static void main(String[] args) {
		
		int i = 0 , sum = 0 ;
		
		while ( i < 4 ) 
		{
			if ( i % 3 == 0)
				continue;
		sum += i ;
		i ++;
		}
		
		System.out.println("The sum is " + sum);
		
		// TODO Auto-generated method stub

	}

}
