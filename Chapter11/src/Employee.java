
public class Employee extends Person{
	protected String office ;
	protected int salary;
    protected MyDate DateHired = new MyDate(2000,01,01);
    
    public Employee(){
    	super();
    	office = "No Office";
    	salary = 0;
    }
    
    public Employee(String office, int salary, MyDate DateHired) {
    	this.office = office;
    	this.salary = salary;
    	this.DateHired = DateHired;
    }
    
    public void setOffice(String office) {
    	this.office = office;
    }
    
    public void setSalary(int salary) {
    	this.salary = salary;
    }
    
    public void setHiredDate(int year, int month, int day ) {
    	DateHired = new MyDate(year,month,day);
    }
    @Override
    public String toString() {
    	return super.toString() + "\n" + "Office: "+office + "\n"+"Salary: "+salary + "\n"+"DateHired: "+DateHired.getYear()+"/"+DateHired.getMonth()+"/"+DateHired.getDay()+"\n";
    }
    
    public static void main(String[] args) {
    	Employee newEmployee = new Employee("Government9001",90000,new MyDate(2008,01,02));
    	System.out.println(newEmployee.toString());
    }
	
}