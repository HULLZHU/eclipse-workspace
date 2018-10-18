import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FindUserTables {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//Load the JDBC Driver
		Class.forName(ScottJDBC.ForName);
		System.out.println("Driver Loaded");
		
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password);
		System.out.println("Database Connected");
		
		DatabaseMetaData dbMetaData = connection.getMetaData();
		
		ResultSet rsTables = dbMetaData.getTables(null,null,null,new String[] {"TABLE"});
		System.out.println("User Tables : "); 
		System.out.println(rsTables.getString("TABLE")+ " ");
		
		connection.close();
            
	} 
 
}
