//Oct 14, 2018, 17:45,StartBuck,Stamford, CT
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;


public class TestCallableStatement {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName(ScottJDBC.ForName);
		try {
			Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,"scott","123456");
			CallableStatement callableStatement = connection.prepareCall("{? = call studentFound(?,?)}");
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter a student first name");
			String firstName = input.nextLine();
			System.out.println("Please enter a student second name");
			String lastName = input.nextLine();
			
			callableStatement.setString(2, firstName);
			callableStatement.setString(3, lastName);
			callableStatement.registerOutParameter(1, Types.INTEGER);
			callableStatement.executeQuery();
			  
			if ( callableStatement.getInt(1)>=1)
				System.out.println(firstName + " "+ lastName +" is in the database");
			else
				System.out.println(firstName + " "+lastName + " is not in the database");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
	}  
 
}
