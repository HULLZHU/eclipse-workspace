import java.util.ArrayList;

public class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents ++ ;
	}
	
	public String[] getStudents() {
		return students;
	}
	
	public int getNumberOfStudent() {
		return numberOfStudents;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void dropStudent(String student) {
		
	}
	
	@Override 
	public Object clone()throws CloneNotSupportedException {
		Course courseClone = (Course)super.clone();
		String[] studentsClone = new String[100];
		for ( int i = 0; i < studentsClone.length ; i ++ ) {
			studentsClone[i] = students[i];
		}
		courseClone.students = studentsClone;
		return courseClone;
 	}


  
}
