import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class TestResultMetaData {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		//Load the JDBC Driver
		Class.forName(ScottJDBC.ForName);
		System.out.println("MySQL Driver Loaded"); 
		 
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
		System.out.println("Database Connected");
		
		Statement statement = connection.createStatement();
		System.out.println("h"=="h"); 
		ResultSet resultSet = statement.executeQuery("SELECT * FROM Enrollment");
		
		ResultSetMetaData rsMetaData = resultSet.getMetaData();
		
		for ( int i = 1 ; i <=rsMetaData.getColumnCount();  i++ ) {
			System.out.printf("%-12s\t",rsMetaData.getColumnName(i)); 
		}  
		System.out.println("");
		 
		while ( resultSet.next()) { 
			for ( int i =  1 ; i <= rsMetaData.getColumnCount(); i ++ ) {
				System.out.printf("%-12s\t",resultSet.getObject(i)); 
			} 
			System.out.println("");
		}
		connection.close();
	}

}
