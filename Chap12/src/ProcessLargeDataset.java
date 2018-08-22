import java.net.*;
import java.io.*;
import java.util.*;
public class ProcessLargeDataset {
	public static void main(String[] args) throws MalformedURLException {
		if ( args.length != 1){
			System.out.println("Usage : java ProcessLargeDataset URL");
			System.exit(0);
		}
		try {
			URL myURL = new URL(args[0]);
			Scanner input = new Scanner(myURL.openStream());
			double totalSalaryOfFaculty = 0;
			double totalFacultyNumber = 0;
			double totalSalaryOfAssoProf = 0;
			double totalAssoProfNum = 0;
			double totalSalaryOfFullProf = 0;
			double totalFullProNum = 0;
			double totalSalaryofAssiProf = 0;
			double totalAssiProfNum = 0;
			while ( input.hasNextLine()) {
				totalFacultyNumber ++;
				System.out.println("Current Faculty Number£º" + totalFacultyNumber);
				String str = input.nextLine();
				Scanner tempInput = new Scanner(str);
				
				double salary = tempInput.nextDouble();
				totalSalaryOfFaculty += salary ;
				if ( str.contains("assistant")) {
					totalAssiProfNum ++;
					totalSalaryofAssiProf += salary;
					
				}
				else if (str.contains("associate")) {
					totalAssoProfNum ++;
					totalSalaryOfAssoProf +=salary;
					
				}
				else if ( str.contains("full")) {
					totalFullProNum++;
					totalSalaryOfFullProf += salary;
				}
			}
			System.out.println("The average salary of all professor is " + totalSalaryOfFaculty/totalFacultyNumber);
			System.out.println("The average salary of all full professor is " + totalSalaryOfFullProf/totalFullProNum);
			System.out.println("The average salary of all associate professor is " + totalSalaryOfAssoProf/totalAssoProfNum );
			System.out.println("The average salary of all a professor is " +totalSalaryofAssiProf/totalAssiProfNum );
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
