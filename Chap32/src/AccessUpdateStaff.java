import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AccessUpdateStaff extends Application {
	private TextField tfId = new TextField();
	private TextField tfLastName = new TextField();
	private TextField tfFirstName = new TextField();
	private TextField tfMi = new TextField();
	private TextField tfAddress = new TextField();
	private TextField tfCity = new TextField();
	private TextField tfState = new TextField();
	private TextField tfTelephone = new TextField();
	private Label lblRecord = new Label(""); 
	private Button btView = new Button("View");
	private Button btInsert = new Button("Insert");
	private Button btUpdate = new Button("Update");
    private Button btClear = new Button("Clear");
	
    public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//set the bottom hbox
		
		HBox hbox = new HBox(7);
		hbox.getChildren().addAll(btView,btInsert,btUpdate,btClear);
		hbox.setAlignment(Pos.CENTER);
		
		//set the gridPane 
		GridPane gridPane = new GridPane();
		gridPane.setVgap(5);
		gridPane.add(new Label("ID",tfId), 0, 0);
		gridPane.add(new Label("Last Name",tfLastName), 0, 1);
		gridPane.add(new Label("FirstName",tfFirstName), 1, 1);
		gridPane.add(new Label("MI",tfMi ), 2, 1); 
		gridPane.add(new Label("Address",tfAddress), 0, 2); 
		gridPane.add(new Label("City",tfCity), 0, 3);
		gridPane.add(new Label("State",tfState), 1, 3);
		gridPane.add(new Label("Telephone",tfTelephone),0,4); 
		//set textfield 
		tfId.setPrefColumnCount(9);
		tfLastName.setPrefColumnCount(15);
		tfFirstName.setPrefColumnCount(15);
		tfMi.setPrefColumnCount(1);
		tfAddress.setPrefColumnCount(20);
		tfCity.setPrefColumnCount(20); 
		tfState.setPrefColumnCount(2);
		tfTelephone.setPrefColumnCount(10);
		//set borderPane
		BorderPane pane = new BorderPane();
		pane.setTop(lblRecord);
		pane.setCenter(gridPane);
		pane.setBottom(hbox);
		
		initializeDB();
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void initializeDB() throws ClassNotFoundException, SQLException {
		//load driver
		Class.forName(ScottJDBC.ForName);
		lblRecord.setText("DataBase Loaded");
		 
		//get connection
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,ScottJDBC.username,ScottJDBC.password); 
		lblRecord.setText("DataBase Connected");
		
		//create statement
		Statement stmt = connection.createStatement();
		
		//btView 
		btView.setOnAction(e ->{ 
			String id = tfId.getText();
			if (id.length() != 9)
				lblRecord.setText("The length of ID must be 9");
			else {
				try {
					ResultSet resultSet = stmt.executeQuery("SELECT * FROM Staff Where Staff.id = "+ id);
					if (resultSet.next()) {
						tfLastName.setText(resultSet.getString(2));
						tfFirstName.setText(resultSet.getString(3));
						tfMi.setText(resultSet.getString(4)); 
						tfAddress.setText(resultSet.getString(5));
						tfCity.setText(resultSet.getString(6));
						tfState.setText(resultSet.getString(7));
						tfTelephone.setText(resultSet.getString(8));
					}
					else {
						lblRecord.setText("Sorry, We Cannot Find Your Track");
					}
					
					
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace(); 
				}
			} 
		});
		
		btInsert.setOnAction(e ->{ 
			insertNewStaff(stmt);
		}); 
		
		btUpdate.setOnAction( e ->{ 
			String id =tfId.getText();
			if ( id.length() != 9) { 
				lblRecord.setText("Please make sure the length of the ID is 9");
			}
			else {    
				try {		  
					ResultSet resultSet = stmt.executeQuery("SELECT * FROM Staff Where Staff.id ="+id); 
					if (!resultSet.next()) {
						lblRecord.setText("We cannot find your result");
						tfLastName.clear();
						tfFirstName.clear(); 
						tfMi.clear();
						tfAddress.clear();
						tfCity.clear(); 
						tfState.clear(); 
						tfTelephone.clear();
						}
					else {   
						stmt.executeUpdate("DELETE FROM Staff WHERE id="+id);
						insertNewStaff(stmt);
						lblRecord.setText("You Successfully Update Your Record");
					} 
				}                    
				catch (Exception ex) {
					ex.printStackTrace(); 
				} 
			}
		}); 
		
		btClear.setOnAction(e ->{
			String id = tfId.getText();
			if (id.length() != 9)
				lblRecord.setText("The length of ID must be 9");
			else {
				try {
					ResultSet resultSet = stmt.executeQuery("SELECT * FROM Staff Where Staff.id = "+ id);
					if (resultSet.next()) {
						tfLastName.setText(resultSet.getString(2));
						tfFirstName.setText(resultSet.getString(3));
						tfMi.setText(resultSet.getString(4)); 
						tfAddress.setText(resultSet.getString(5));
						tfCity.setText(resultSet.getString(6));
						tfState.setText(resultSet.getString(7));
						tfTelephone.setText(resultSet.getString(8));
						
						stmt.executeUpdate("DELETE FROM Staff WHERE id="+id);
						lblRecord.setText("Your History has been deleted");
					}
					else {   
						lblRecord.setText("Sorry, We Cannot Find Your Track");
					}
					
					
				} catch (SQLException ex) {
					// TODO Auto-generated catch block
					ex.printStackTrace(); 
				}
			} 
			
		});
	}
	
	public  void insertNewStaff(Statement stmt) {
		if (tfId.getText().length()!=9 || tfMi.getText().length()!=1 || tfState.getText().length() != 2 || tfTelephone.getText().length()!=10) {
			lblRecord.setText("The length of Id must be 9, the length of Mi is 1,\n the length of State is 2, the length of telephone must be 10");
		}
		
		else if (tfCity.getText().length()>20)
			lblRecord.setText("The length of City must be within 20 characters");
		else if (tfAddress.getText().length()>20)
			lblRecord.setText("The length of Address must be within 20 characters");
		else if (tfMi.getText().length()>1)
			lblRecord.setText("The length of mid name must be only one-character length");
		else if(tfFirstName.getText().length()>15)
			lblRecord.setText("The length of first name must be within 15 characters");
		else if (tfLastName.getText().length() > 15)
			lblRecord.setText("The length of Last name must be within 15 charatcers");
		
		else {
			//id| lastName | firstName | mi| address|city|state|telephone|
			String id = "'"+tfId.getText()+"'";
			String lastName = "'"+tfLastName.getText()+"'";
			String firstName ="'"+ tfFirstName.getText()+"'";
			String mi = "'"+tfMi.getText()+"'";
			String address ="'"+ tfAddress.getText()+"'";
			String city = "'"+tfCity.getText()+"'";
			String state = "'"+tfState.getText()+"'";
			String telephone = "'"+tfTelephone.getText()+"'";
			try {
				stmt.executeUpdate("INSERT INTO Staff VALUES("+id+","+lastName+","+firstName+","+mi+","+address+","+city+","+state+","+telephone+")");
				lblRecord.setText("Successfully add your info");
			} catch (SQLException e1) {
				e1.printStackTrace(); 
			} 	 
		}
	}
}
