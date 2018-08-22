
public class Person {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected String Email;
	
	public Person() {
	}
	
	public Person (String name, String address, String phoneNumber,String Email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.Email = Email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String toString() {
		return "Name: "+ name +"\n"+"Address: "+address+"PhoneNumber: "+phoneNumber+"\n"+"Email: "+Email+"\n";
	}
}
