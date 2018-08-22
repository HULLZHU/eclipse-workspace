package Chapter11;
import java.util.ArrayList;

public class Course {
	//data field
	protected String courseName;
	protected int numberOfStudents;
	protected ArrayList<String> students = new ArrayList<>();
	//constructor
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public Course(){
		this("No Name");
	}
	public String getCourseName() {
		return courseName;
	}
	public int getStudentNumber() {
		return numberOfStudents;
	}
	public void addStudent(String StudentName) {
		students.add(StudentName);
		numberOfStudents++;
	}
	
	public void removeStudent (String studentName) {
		int index = students.indexOf(studentName);
		students.remove(index);
		numberOfStudents -- ;
	}
	
	public String[] getAllStudents() {
		String[] studentsArray = new String[numberOfStudents];
		students.toArray(studentsArray);
		return studentsArray;
	}
	
	public static void main(String[] args) {
		Course history = new Course("History");
		history.addStudent("ZhuHe");
		history.addStudent("Linziqi");
		history.addStudent("Shenhongxia");
		history.addStudent("Zhubingjun");
		history.removeStudent("Zhubingjun");
		for ( int i = 0; i < history.getAllStudents().length; i ++ ) {
			System.out.println(history.getAllStudents()[i]);

		}
	}
}
