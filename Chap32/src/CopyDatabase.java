import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class CopyDatabase {
	private static CallableStatement stmt ;
	private static Statement stmt2;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		initializeDB();
		ResultSet rsSet = stmt2.executeQuery("SELECT  *   FROM Student1");
		try {
		while ( rsSet.next() ) {    
			//get 
			String userName = rsSet.getString(1);
			String password = rsSet.getString(2);
			//get names
			String fullName = rsSet.getString(3);
			System.out.println(userName);
			System.out.println(password); 
			System.out.println(fullName); 
			String[] tokens = fullName.split(" ");
			String firstName; 
			String midName;
			String lastName;  
			firstName = tokens[0];
			lastName = tokens[tokens.length-1];
			if ( tokens.length == 3)
				midName = tokens[1]; 
			else    
				midName = "_";    
	        
			 
			output(userName,password,firstName,midName,lastName);
		}  
		}
		catch (Exception ex) { 
			ex.printStackTrace();
		}
	} 
  
	private static void output(String userName, String password, String firstName, String midName, String lastName) throws SQLException {
		stmt.setString(2, userName);
		stmt.setString(3, password);
		stmt.setString(4, firstName);
		stmt.setString(5, midName);
		stmt.setString(6, lastName); 
		stmt.registerOutParameter(1, Types.INTEGER);
		stmt.execute();
		  
	} 

	private static void initializeDB() throws ClassNotFoundException, SQLException {
		Class.forName(ScottJDBC.ForName); 
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
		stmt = connection.prepareCall("{? = call insertValues(?,?,?,?,?)}");       
		stmt2=connection.createStatement();
	}

} 
