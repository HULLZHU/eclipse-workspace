
public class Student extends Person {
	//freshman, sophomore, junior, senior
	private  String Status;
	
	public Student () {
		super();
	}
	
	public Student(String name, String address, String phoneNumber,String Email, String Status  ) {
		this.setName(name);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(Email);
		this.setStatus(Status);
		
	}
	
	public final void setStatus(String Status) {
		this.Status = Status;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Status: "+Status;
	}
	
	public static void main(String args[]) {
		Student Linziqi = new Student("Linziqi", "HangchengJiedao", "phoneNumber", "Email", "Sophomore") ;
		System.out.println(Linziqi.toString());
	}
	
}
