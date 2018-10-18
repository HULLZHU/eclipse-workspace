import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ShowTableContent extends Application{
	private TextField tfTableName = new TextField();
	private TextArea taContent = new TextArea();
	private Label lblRecord = new Label();
	private Statement stmt ;
	public static void main(String[]args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		initializeDB();
		//set the top pane
		HBox topPane = new HBox (30);
		Label lblTableName = new Label("Table Name                  " , tfTableName );
		lblTableName.setContentDisplay(ContentDisplay.RIGHT);
		Button btShow = new Button("Show Content");
		topPane.getChildren().addAll(lblTableName,btShow);
		//set the center pane
		ScrollPane scrollPane = new ScrollPane(taContent);
		//set the main Pane
		BorderPane pane = new BorderPane();
		pane.setTop(topPane);
		pane.setCenter(scrollPane); 
		pane.setBottom(lblRecord); 
		
		btShow.setOnAction(new ShowHandler());	
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void initializeDB() throws ClassNotFoundException, SQLException {
		Class.forName(ScottJDBC.ForName);
		Connection connection = DriverManager.getConnection(ScottJDBC.connectionName,
				ScottJDBC.username,ScottJDBC.password);
		stmt = connection.createStatement();
		lblRecord.setText("DB Connected");
		
	}

	public class ShowHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent e) {
			String tableName = tfTableName.getText();
			try {
				ResultSet rsSet  = stmt.executeQuery("SELECT * FROM "+ tableName);
				ResultSetMetaData rsMetaData = rsSet.getMetaData();
				
				for ( int i = 1 ; i <= rsMetaData.getColumnCount() ; i++ ) {
					taContent.appendText(rsMetaData.getColumnName(i)+"\t");
					if ( i == rsMetaData.getColumnCount())
						taContent.appendText("\n");
				}
				   
			while (rsSet.next()) {
				for ( int i = 1; i <= rsMetaData.getColumnCount(); i ++ ) {
					taContent.appendText(rsSet.getString(i)+"\t");
				}
				
				taContent.appendText("\n");
			}
 				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
} 
