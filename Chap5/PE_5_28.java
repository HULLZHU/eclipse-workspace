
public class PE_5_28 {

	public static void main(String[] args) {
		System.out.print("January ");
		int i = 1;
		while ( 1<=i && i<=365 ) {
			if ( i>=1 && i<=31) {
				System.out.print(" January "+i+ " 2013 is " );
			}
			if ( i>=32 && i <= 59) {
				System.out.print(" February " + (i-31) +" 2013 is ");
			}
			if ( i>=60 && i<=90 ) {
				System.out.print(" March "+ ( i - 59)+ " 2013 is ");
			}
			if ( i>=91 && i<=120) {
				System.out.print(" April " + ( i - 90) + "  2013 is ");
			}
			if ( i>= 121 && i <= 151) {
				System.out.print(" May " + ( i - 120)+ " 2013 is ");
			}
			if ( i >= 152 && i <=181) {
				System.out.print(" June " + ( i - 151)+ " 2013 is ");
			}
			if ( i >=182 && i<=212 ) {
				System.out.print(" July " + ( i - 181)+ " 2013 is ");
			}
			if ( i >=213 && i<=243 ) {
				System.out.print(" August " + ( i - 212)+ " 2013 is ");
			}
			if ( i >=244 && i<=273) {
				System.out.print(" September " + ( i - 243 )+ " 2013 is ");
			}
			if ( i >=274 &&  i<= 304) {
				System.out.print(" October " + ( i - 273)+ " 2013 is ");
			}
			if ( i>=295 && i<=334) {
				System.out.print(" November " + (i - 304 )+ " 2013 is");
			}
			if ( i>=335 && i<=365) {
				System.out.print(" December "+ (i-334)+" 2013 is ");
			}
			
		 switch ( i % 7 ) {
		 case 0 : System.out.println(" Tuesday");break;
		 case 1 : System.out.println("Wednesday");break;
		 case 2 : System.out.println("Thursday");break;
		 case 3 : System.out.println("Friday");break;
		 case 4 : System.out.println("Saturday");break;
		 case 5 : System.out.println("Sunday");break;
		 case 6 : System.out.println("Monday");break;
		 }
			
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
