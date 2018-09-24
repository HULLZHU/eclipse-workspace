import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AddressBookGUI extends Application{
	private GridPane pane = new GridPane();
	private HBox hbox1 = new HBox();
	private HBox hbox2 = new HBox(35);
	private Button btAdd = new Button("Add");
	private Button btFirst = new Button("First");
	private Button btNext = new Button("Next");
	private Button btPrevious = new Button("Previous");
	private Button btLast = new Button("Last");
	private Button btUpdate = new Button("Update");
	private TextField tfName= new TextField();
	private TextField tfStreet = new TextField();
	private TextField tfCity = new TextField();
	private TextField tfState = new TextField();
	private TextField tfZip = new TextField();
	private static TextArea description = new TextArea("Information Will be displayed here");
	private  int index = 0;
	private static int indicator = 0; // this is for display the page number
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		pane.setVgap(5);
		pane.setHgap(5);
	
		//set 2 boxes
		pane.add(hbox1, 0, 2);
		pane.add(hbox2, 0, 3);
		pane.add(description, 0, 4);
		//set the first row :Name row
		
		Label lbName = new Label("  Name",tfName);
		lbName.setContentDisplay(ContentDisplay.RIGHT);
		tfName.setPrefColumnCount(34);
		pane.add(lbName, 0, 0);
		//set the second row : Street row
		
		Label lbStreet = new Label("  Street",tfStreet);
		lbStreet.setContentDisplay(ContentDisplay.RIGHT);
		tfStreet.setPrefColumnCount(34);
		pane.add(lbStreet, 0, 1);
		
		//set the second row : city     state      Zip
		//city
		
		Label lbCity = new Label("   City  ",tfCity);
		lbCity.setContentDisplay(ContentDisplay.RIGHT);
		tfCity.setPrefColumnCount(20);
		//state
		
		Label lbState = new Label("State",tfState);
		tfState.setPrefColumnCount(2);
		lbState.setContentDisplay(ContentDisplay.RIGHT);
		//zip
		
		Label lbZip = new Label("Zip",tfZip);
		lbZip.setContentDisplay(ContentDisplay.RIGHT);
		tfZip.setPrefColumnCount(5);
		//add them all to the hbox1
		hbox1.getChildren().addAll(lbCity,lbState,lbZip);
		
		//now set the buttons
		hbox2.getChildren().addAll(btAdd,btFirst,btNext,btPrevious,btLast,btUpdate);
		//set buttons
		setButtons();
		addListeners();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void addListeners() {
		//add tfName listener
		tfName.textProperty().addListener(e ->{
			if(tfName.getText().length()>32) {
				tfName.setStyle("-fx-text-fill:red");
				AddressBookGUI.setTextArea("Notice: The Name length should not be beyond 32 characters");
			}
			else {
				tfName.setStyle("-fx-tet-fill:black");
				AddressBookGUI.setTextArea("");
			}
		});
		//add tfStreet listener
		tfStreet.textProperty().addListener(e->{
			if(tfStreet.getText().length() > 32) {
				tfStreet.setStyle("-fx-text-fill:red");
				AddressBookGUI.setTextArea("Notice: The Street length should not be beyond 32 characters");
			}
			else {
				tfStreet.setStyle("-fx-text-fill:black");
				AddressBookGUI.setTextArea("");
			}
		});
		
		//add tfCity listener
		tfCity.textProperty().addListener(e->{
			if(tfCity.getText().length() > 20) {
				tfCity.setStyle("-fx-text-fill:red");
				AddressBookGUI.setTextArea("Notice: The City length should not be beyond 20 characters");
			}
			else {
				tfCity.setStyle("-fx-text-fill:black");
				AddressBookGUI.setTextArea("");
			}
		});
		
		//add tfState listener
		tfState.textProperty().addListener(e->{
			if(tfState.getText().length() > 2) {
				tfState.setStyle("-fx-text-fill:red");
				AddressBookGUI.setTextArea("Notice: The State length should not be beyond 2 characters");
			}
			else {
				tfState.setStyle("-fx-text-fill:black");
				AddressBookGUI.setTextArea("");
			}
			
		});
		
		//add tfZip
		tfZip.textProperty().addListener(e ->{
			if(tfZip.getText().length() > 5) {
				tfZip.setStyle("-fx-text-fill:red");
				AddressBookGUI.setTextArea("Notice: The State length should not be beyond 5 characters");
			}
			else {
				tfZip.setStyle("-fx-text-fill:black");
				AddressBookGUI.setTextArea("");
			}
		});
		
	}

	
	private void setBtUpdate() {

			btUpdate.setOnAction(e ->{
				if ( tfName.getText().length() <= 32 && tfStreet.getText().length() <=32 && tfCity.getText().length() <= 20
						&& tfState.getText().length() == 2 && tfZip.getText().length()==5) {
					BackGroundForAddressBook bg = new BackGroundForAddressBook();
					bg.update(tfName.getText(),tfStreet.getText(),tfCity.getText(),tfState.getText(),tfZip.getText(),index);
				}
				else {
					AddressBookGUI.setTextArea("Sorry, please double check the field filled by red characters.");
				}
			});
	}

	///set buttons
	private void setButtons() {
		setbtAdd();
		setBtFirst();
		setBtNext();
		setBtPrevious();
		setBtLast();
		setBtUpdate();
	}

	//set last button
	private void setBtLast() {
		btLast.setOnAction(e->{
			try {
				index = (int)(91*(BackGroundForAddressBook.getCount()));
				String[] strs = BackGroundForAddressBook.getData(index);
				this.setName(strs[0]);
				this.setStreet(strs[1]);
				this.setCity(strs[2]);
				this.setState(strs[3]);
				this.setZip(strs[4]);
				indicator = (int) BackGroundForAddressBook.getCount();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	}

	///set btAdd
	private void setbtAdd() {
		btAdd.setOnAction(e ->{
			if ( tfName.getText().length() <= 32 && tfStreet.getText().length() <=32 && tfCity.getText().length() <= 20
					&& tfState.getText().length() == 2 && tfZip.getText().length()==5) {
				BackGroundForAddressBook bg = new BackGroundForAddressBook(tfName.getText(),tfStreet.getText(),tfCity.getText()
						,tfState.getText(),tfZip.getText());
			}
			else {
				AddressBookGUI.setTextArea("Sorry, please double check the field filled by red characters.");
			}
		});
		
	}
	
	///setBtfirst
	private void setBtFirst() {
		btFirst.setOnAction(e->{
			try {
				index = 0;
				String[] strs = BackGroundForAddressBook.getData(index);
				this.setName(strs[0]);
				this.setStreet(strs[1]);
				this.setCity(strs[2]);
				this.setState(strs[3]);
				this.setZip(strs[4]);
				indicator = 0;
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
	}
	
	//set next button
	private void setBtNext() {
		;
		btNext.setOnAction(e ->{try 
		{
			index += 91;
			String[] strs = BackGroundForAddressBook.getData(index);
			this.setName(strs[0]);
			this.setStreet(strs[1]);
			this.setCity(strs[2]);
			this.setState(strs[3]);
			this.setZip(strs[4]);
			System.out.println("Next"+strs[0]);
			indicator ++;
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			AddressBookGUI.setTextArea("Sorry, all the information is read.");
		}catch (NullPointerException ex) {
			System.out.println("Sorry, all the information is read");
		}
			
		});
	}
	
	//set previous button
	private void setBtPrevious() {	
		
		btPrevious.setOnAction(e ->{
			try {
				if (index >= 91)
					index -= 91;
				String[] strs = BackGroundForAddressBook.getData(index);
				this.setName(strs[0]);
				this.setStreet(strs[1]);
				this.setCity(strs[2]);
				this.setState(strs[3]);
				this.setZip(strs[4]);
				System.out.println("previrous:"+strs[0]);
				indicator -- ;
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		
	});
	}

	
	
	
	
	
	
	///////////////////////////////////setter for textfields ///////////////////////
	private void setName(String name) {
		this.tfName.setText(name);
	}
	
	private void setStreet(String street) {
		this.tfStreet.setText(street);
	}
	
	private void setCity(String city) {
		this.tfCity.setText(city);
	}
	
	private void setState(String state) {
		this.tfState.setText(state);
	}
	
	private void setZip(String zip) {
		this.tfZip.setText(zip);
	}

	//offer the method to help BackgroundAddressBook to control the description
	static void  setTextArea(String str)	{
		description.setText(str);
	}
	


}
