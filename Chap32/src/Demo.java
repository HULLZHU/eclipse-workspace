import java.sql.*;
public class Demo implements ScottJDBC {
	
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		//load the JDBC driver
		Class.forName(ScottJDBC.ForName); 
		System.out.println("Driver Loaded");
		 
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
		System.out.println("Databas Connected");
		
		//create a statement 
		Statement statement = connection.createStatement();
		
		statement.executeUpdate("CREATE TABLE TEST(col1 char(5),col2 char(5))");
		//execute a statement
		ResultSet resultSet = statement.executeQuery("SELECT firstName,mi,lastName FROM Student where lastName = 'Smith'");
		
		while ( resultSet.next()) {
			System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3));
		} 
		connection.close();
	}   
	   
}    
           