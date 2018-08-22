import java.util.*;
public class PE_06_08 {

	public static void main(String[] args) {
		System.out.println("How many lines do you want to have in the table");
		Scanner input = new Scanner(System.in);
		int numOfLine = input.nextInt();
		System.out.println("After title is created, please input starting celcius and starting fahrenheit");
		printTitle();
		printBody(numOfLine);
		// TODO Auto-generated method stub
	}
	
	public static void printTitle( ) {
		System.out.println("Celcius     Fahrenheit      |      Faherenheit      Celsius");
	}
	
	public static void printBody (int numOfLine ) {
		Scanner input = new Scanner(System.in);
		double celcius = input.nextDouble();
		double fahrenheit = input.nextDouble();
		int count = 1;
		while ( count <= numOfLine) {
			celsiusToFahrenheit( celcius );
			System.out.print("    |    ");
			fahrenheitToCelcius( fahrenheit );
			celcius --;
			fahrenheit -= 10;
			count ++;
		}
		
	}
	
	public static void celsiusToFahrenheit( double celcius) {
		System.out.print(celcius + "    ");
		System.out.printf("%.1f", (9.0/5)*celcius+32);
	}
	
	public static void fahrenheitToCelcius (double fahrenheit) {
		System.out.print(fahrenheit + "    ");
		System.out.printf("%.2f\n",(5.0/9)*(fahrenheit-32));
		
	}

}
