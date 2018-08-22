
public class Faculty extends Employee{
	private int officeHours;
	private String officeRank;
	
	public Faculty(int officeHour, String officeRank) {
		this.officeHours = officeHour;
		this.officeRank = officeRank;
	}
	
	public void  setOfficeHour(int hour) {
		this.officeHours = hour;
	}
	public void setOfficeRank(String rank) {
		this.officeRank = rank;
	}
	@Override
	public String toString() {
		return super.toString() + "Hours: "+ officeHours + "\n"+ "Rank: "+ officeRank;
	}
	
	public static void main(String args[]) {
		Faculty newFaculty = new Faculty(800, "Director");
		System.out.println(newFaculty.toString());
		System.out.println("__________________");
		newFaculty.setAddress("Apple Rd");
		newFaculty.setName("Tom");
		newFaculty.setEmail("385160087@qq.com");
		newFaculty.setSalary(90100);
		newFaculty.setOffice("JPmorgan189000");
		newFaculty.setOfficeHour(900);
		System.out.println(newFaculty.toString());
		
	}
}
