import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.Exception.*;
public class BackGroundForAddressBook {
	private String name ;
	private String street;
	private String city;
	private String state;
	private String zip;
	private DataOutputStream output;
	private int countOfLengthSet = 0;
	private static int index = 0;
	private static int count = 0;
	
	public BackGroundForAddressBook(){
	}
	
	public BackGroundForAddressBook(String name, String street,String city, String state, String zip){
		this.update(name, street, city, state, zip);
	}
	//Setter and getter of name
	public void setName(String name) {
		try {
			name = setFixedLengthString(name,32);
		} catch (StringLengthError e) {
			e.printStackTrace();
		}
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//setter and getter of street
	public void setStreet(String street) {
		try {
			street = setFixedLengthString(street,32);
		}
		catch (StringLengthError e) {
			e.printStackTrace();
		}
		this.street = street;
	}
	
	public String getStreet() {
		return street;
		
	}
	
	//setter and getter of city
	public void setCity(String city) {
		try {
			city = setFixedLengthString(city,20);
		}
		catch (StringLengthError e) {
			e.printStackTrace();
		}
		this.city = city;
	}
	
	public String getCity(String city) {
		return city;
	}
	
	//setter and getter of state
	public void setState(String state) {	
		try {
		state = setFixedLengthString(state,2);
	}
	catch (StringLengthError e) {
		e.printStackTrace();
	}
	this.state = state;
	
	}
	
	public String getState() {
		return state;
	}
	
	//setter and getter of zip
	public void setZip( String zip) {
		try {
			zip = setFixedLengthString(zip,5);
		}
		catch (StringLengthError e) {
			e.printStackTrace();
		}
		this.zip = zip;
		countOfLengthSet++;
	}
	
	public String getZip() {
		return zip;
	}
	
	
	
	//this static method is to make GUI can update its data to *.dat
	public void update(String name,String street,String city,String state, String zip) {
		this.setName(name);
		this.setStreet(street);
		this.setCity(city); 
		this.setState(state);
		this.setZip(zip);
		try {
			RandomAccessFile output = new RandomAccessFile("data.dat","rw");
			output.seek(output.length());
			output.writeChars(this.name);
			output.writeChars(this.street);
			output.writeChars(this.city);
			output.writeChars(this.state); 
			output.writeChars(this.zip);
			
		} catch (FileNotFoundException e) { 
			System.out.println("Sorry, we cannot find your file"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddressBookGUI.setTextArea("Your Updation is Comlete");
		
	}

	public void update(String name,String street,String city,String state, String zip,int index) {
		this.setName(name);
		this.setStreet(street);
		this.setCity(city); 
		this.setState(state);
		this.setZip(zip);
		try {
			RandomAccessFile output = new RandomAccessFile("data.dat","rw");
			output.seek(2*index);
			output.writeChars(this.name);
			output.writeChars(this.street);
			output.writeChars(this.city);
			output.writeChars(this.state); 
			output.writeChars(this.zip);
			
		} catch (FileNotFoundException e) { 
			System.out.println("Sorry, we cannot find your file"); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AddressBookGUI.setTextArea("Your Updation is Comlete");
		
	}

	//set the length of string
	private String setFixedLengthString(String str,int length) throws StringLengthError {
		if(length > str.length()) 
		{ 
			while(str.length() < length){
				str = str + " ";
			}
			
		}
		
		else if(length < str.length()) {
			throw new StringLengthError("Error in String length happened");
		}
		return str;
	}
	
	//this static is to set indexed of AddressBookGUI
	public static String[] getData(int newIndex) throws IOException {
		try(RandomAccessFile output = new RandomAccessFile("data.dat","r");) {
			//Access the file
			
			output.seek(newIndex*2);
		    String name = "";
			String street = "";
			String city= "";
			String state = "";
			String zip = "";
			//get name 
			for ( int i = 0 ; i < 32 ; i ++ ) {
				name = name +output.readChar();
			}
			//get street
			for ( int i = 32; i <  64 ; i ++ ) {
				street = street + output.readChar();
			}
			//get city
			for ( int i = 64; i < 84 ;i++) {
				city = city + output.readChar();
			}
			
			//get state
			for ( int i = 84; i <  86; i ++) {
				state  = state +output.readChar();
			}
			//get zip
			for ( int i = 86 ; i <  91 ; i ++ ) {
				zip = zip + output.readChar();
			}
			//after getting these 5 strings, the static index add 91
			//display strings on GUI
			String[] str  = {name,street,city,state,zip};
			return str;
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (EOFException ex) {
			System.out.println("Press again to make sure you want to look previous one");
		}
		
		return null;
		
	}
	
	public static long getCount() throws FileNotFoundException, IOException {
		count = (int)(new RandomAccessFile("data.dat","r").length()/192);
		System.out.println("count"+count);
		return count;
	}
	
	


}
