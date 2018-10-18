import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseMetaData {
	public static void main(String[]args) throws ClassNotFoundException, SQLException {
		Class.forName(ScottJDBC.ForName); 
		System.out.println("Driver Loaded");
		
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,"scott","123456");
		System.out.println("DataBase Connected");
		
		DatabaseMetaData dbMetaData = connection.getMetaData();
		System.out.println("Database URL : " + dbMetaData.getURL());
		System.out.println("Database User Name : "+ dbMetaData.getUserName());
		System.out.println("Database Product Name : "+dbMetaData.getDatabaseProductName());
		System.out.println("Database Version Name : "+dbMetaData.getDriverName());
		System.out.println("JDBC Driver Version : "+dbMetaData.getDriverVersion());
		System.out.println("JDBC Major Version "+ dbMetaData.getDriverMinorVersion());
		System.out.println("JDBC Database Minor Version : "+ dbMetaData.getDatabaseMinorVersion());
		System.out.println("Max Number of Connections : "+dbMetaData.getMaxConnections());
		System.out.println("Max Table Name Length "+ dbMetaData.getMaxTableNameLength());
		
	}

}
