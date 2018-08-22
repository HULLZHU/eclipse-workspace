import java.util.*;
public class PE_5_29 {

	public static void main(String[] args) {
		System.out.println("Please input the year and the first day of year");
		Scanner input = new Scanner(System.in);
		
		int year = input.nextInt();
		int space = 0;
		//input a day in a week
		String s1 = input.next();
		if (s1.equals("Sunday")) {
			space = 0;
		}
		if ( s1.equals("Monday")) {
			space = 1;
		}
		if ( s1.equals("Tuesday")) {
			space = 2;
		}
		if (s1.equals("Wednesday")) {
			space = 3;
		}
		if (s1.equals("Thursday")) {
			space = 4;
		}
		if ( s1.equals("Friday")) {
			space = 5; 
		}
		if ( s1.equals("Saturday")) {
			space = 6;
		}
		
		
		//i:the day in a year
		int i = 1;
		//countOfSpace
		int countOfSpace = 0;
		
		
		//音頁避定議扮昨
		If1:
		if ( year % 4 != 0) {
			
			If2_1:
			if ( i>=1 && i<=31) {
				System.out.println("      January" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( i<=31) {
					if ( (i+space)%7==0) {
						System.out.println(i);
					}
					else {
						if ( i < 10) {
						System.out.print(i + "   ");
						}
						else {
							System.out.print(i + "  ");
						}
					}
			i++;	
			}
			}
		System.out.println("");
///////////////////////////////////////////////////////////////////////////////////////////////		
			if ( i>=32 && i <= 59) {
				System.out.println("      February" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				space = (31 + space)%7;
				countOfSpace = 0;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-31)<=28) {
					if ( (i-31+space)%7==0) {
						System.out.println(i-31);
					}
					else {
						if ( (i-31) < 10) {
						System.out.print((i-31) + "   ");
						}
						else {
							System.out.print((i-31) + "  ");
						}
					}
			i++;	
			}
			}
		System.out.println("");
		////////////////////////////////////////////////
			if ( i>=60 && i<=90 ) {
				System.out.println("      March " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = (28 + space)% 7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-59)<=31) {
					if ( (i-31-28+space)%7==0) {
						System.out.println(i-31-28);
					}
					else {
						if ( (i-31-28) < 10) {
						System.out.print((i-31-28) + "   ");
						}
						else {
							System.out.print((i-31-28) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////////////////////
			if ( i>=91 && i<=120) {
				System.out.println("      April " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-90)<=30) {
					if ( (i-90+space)%7==0) {
						System.out.println(i-90);
					}
					else {
						if ( (i-90) < 10) {
						System.out.print((i-90) + "   ");
						}
						else {
							System.out.print((i-90) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			///////////////////////////////////////////////////////////
			if ( i>= 121 && i <= 151) {
				System.out.println("      May " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space= ( 30 + space)%7;
				
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-120)<=31) {
					if ( (i-120+space)%7==0) {
						System.out.println(i-120);
					}
					else {
						if ( (i-120) < 10) {
						System.out.print((i-120) + "   ");
						}
						else {
							System.out.print((i-120) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////
			if ( i >= 152 && i <=181) {
				System.out.println("      June " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;

				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-151)<=30) {
					if ( (i-151+space)%7==0) {
						System.out.println(i-151);
					}
					else {
						if ( (i-151) < 10) {
						System.out.print((i-151) + "   ");
						}
						else {
							System.out.print((i-151) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////////////
			if ( i >=182 && i<=212 ) {
				System.out.println("      July " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				space = (30 + space ) % 7;
				countOfSpace= 0;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-181)<=31) {
					if ( (i-181+space)%7==0) {
						System.out.println(i-151);
					}
					else {
						if ( (i-181) < 10) {
						System.out.print((i-181) + "   ");
						}
						else {
							System.out.print((i-181) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			/////////////////////////////////////////////////////////////////////////
			if ( i >=213 && i<=243 ) {
				System.out.println("      August" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			    countOfSpace =0;
			    space = ( 31 + space)%7;
			    while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-212)<=31) {
					if ( (i-212+space)%7==0) {
						System.out.println(i-212);
					}
					else {
						if ( (i-212) < 10) {
						System.out.print((i-212) + "   ");
						}
						else {
							System.out.print((i-212) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
			}
			////////////////////////////
			if ( i >=244 && i<=273) {
				System.out.println("      September" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-243)<=30) {
					if ( (i-243+space)%7==0) {
						System.out.println(i-243);
					}
					else {
						if ( (i-243) < 10) {
						System.out.print((i-243) + "   ");
						}
						else {
							System.out.print((i-243) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
				
			}
			if ( i >=274 &&  i<= 304) {
				System.out.println("      October" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (30 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-273)<=31) {
					if ( (i-273+space)%7==0) {
						System.out.println(i-273);
					}
					else {
						if ( (i-273) < 10) {
						System.out.print((i-273) + "   ");
						}
						else {
							System.out.print((i-273) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
				
			}
			if ( i>=305 && i<=334) {
				System.out.println("      November" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-304)<=31) {
					if ( (i-304+space)%7==0) {
						System.out.println(i-304);
					}
					else {
						if ( (i-304) < 10) {
						System.out.print((i-304) + "   ");
						}
						else {
							System.out.print((i-304) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
			}
			if ( i>=335 && i<=365) {
				System.out.println("      December"
						+ "" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (30 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-335)<=31) {
					if ( (i-335+space)%7==0) {
						System.out.println(i-335);
					}
					else {
						if ( (i-335) < 10) {
						System.out.print((i-335) + "   ");
						}
						else {
							System.out.print((i-335) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
		}

		
			
		// TODO Auto-generated method stub

	}
		
		
		
////////////////////////////////////////////////////////////////////////////////
if ( year % 4 == 0) {
			
			if ( i>=1 && i<=31) {
				System.out.println("      January" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( i<=31) {
					if ( (i+space)%7==0) {
						System.out.println(i);
					}
					else {
						if ( i < 10) {
						System.out.print(i + "   ");
						}
						else {
							System.out.print(i + "  ");
						}
					}
			i++;	
			}
			}
		System.out.println("");
///////////////////////////////////////////////////////////////////////////////////////////////		
			if ( i>=32 && i <= 60) {
				System.out.println("      February" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				space = (31 + space)%7;
				countOfSpace = 0;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-31)<=29) {
					if ( (i-31+space)%7==0) {
						System.out.println(i-31);
					}
					else {
						if ( (i-31) < 10) {
						System.out.print((i-31) + "   ");
						}
						else {
							System.out.print((i-31) + "  ");
						}
					}
			i++;	
			}
			}
		System.out.println("");
		////////////////////////////////////////////////
			if ( i>=61 && i<=91 ) {
				System.out.println("      March " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = (29 + space)% 7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-60)<=31) {
					if ( (i-60+space)%7==0) {
						System.out.println(i-60);
					}
					else {
						if ( (i-60) < 10) {
						System.out.print((i-60) + "   ");
						}
						else {
							System.out.print((i-60) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////////////////////
			if ( i>=92 && i<=121) {
				System.out.println("      April " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-91)<=30) {
					if ( (i-91+space)%7==0) {
						System.out.println(i-91);
					}
					else {
						if ( (i-91) < 10) {
						System.out.print((i-91) + "   ");
						}
						else {
							System.out.print((i-91) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			///////////////////////////////////////////////////////////
			if ( i>= 122 && i <= 152) {
				System.out.println("      May " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space= ( 30 + space)%7;
				
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-121)<=31) {
					if ( (i-121+space)%7==0) {
						System.out.println(i-121);
					}
					else {
						if ( (i-121) < 10) {
						System.out.print((i-121) + "   ");
						}
						else {
							System.out.print((i-121) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////
			if ( i >= 153 && i <=182) {
				System.out.println("      June " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;

				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-152)<=30) {
					if ( (i-152+space)%7==0) {
						System.out.println(i-152);
					}
					else {
						if ( (i-152) < 10) {
						System.out.print((i-152) + "   ");
						}
						else {
							System.out.print((i-152) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			////////////////////////////////////////////////////////////////////////////
			if ( i >=183 && i<=213 ) {
				System.out.println("      July " + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				space = (30 + space ) % 7;
				countOfSpace= 0;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-182)<=31) {
					if ( (i-182+space)%7==0) {
						System.out.println(i-151);
					}
					else {
						if ( (i-182) < 10) {
						System.out.print((i-182) + "   ");
						}
						else {
							System.out.print((i-182) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");
			}
			/////////////////////////////////////////////////////////////////////////
			if ( i >=214 && i<=244 ) {
				System.out.println("      August" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
			    countOfSpace =0;
			    space = ( 31 + space)%7;
			    while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-213)<=31) {
					if ( (i-213+space)%7==0) {
						System.out.println(i-213);
					}
					else {
						if ( (i-213) < 10) {
						System.out.print((i-213) + "   ");
						}
						else {
							System.out.print((i-213) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
			}
			////////////////////////////
			if ( i >=245 && i<=274) {
				System.out.println("      September" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace=0;
				space = ( 31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-244)<=30) {
					if ( (i-244+space)%7==0) {
						System.out.println(i-244);
					}
					else {
						if ( (i-244) < 10) {
						System.out.print((i-244) + "   ");
						}
						else {
							System.out.print((i-244) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
				
			}
			if ( i >=275 &&  i<= 305) {
				System.out.println("      October" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (30 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-274)<=31) {
					if ( (i-274+space)%7==0) {
						System.out.println(i-274);
					}
					else {
						if ( (i-274) < 10) {
						System.out.print((i-274) + "   ");
						}
						else {
							System.out.print((i-274) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
				
			}
			if ( i>=306 && i<=335) {
				System.out.println("      November" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (31 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-305)<=31) {
					if ( (i-305+space)%7==0) {
						System.out.println(i-305);
					}
					else {
						if ( (i-305) < 10) {
						System.out.print((i-305) + "   ");
						}
						else {
							System.out.print((i-305) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
			}
			if ( i>=336 && i<=366) {
				System.out.println("      December"
						+ "" + year +"       " );
				System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
				System.out.println("Sun Mon Tue Wed Thu Fri Sat");
				countOfSpace = 0;
				space = (30 + space)%7;
				while (countOfSpace < space) {
					System.out.print("    ");
					countOfSpace ++;
				}
				while ( (i-336)<31) {
					if ( (i-336+space)%7==0) {
						System.out.println(i-336);
					}
					else {
						if ( (i-336) < 10) {
						System.out.print((i-336) + "   ");
						}
						else {
							System.out.print((i-336) + "  ");
						}
					}
			i++;	
			}
				System.out.println("");  
		}

		
			
		// TODO Auto-generated method stub

	}

}
}
