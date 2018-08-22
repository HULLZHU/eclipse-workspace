
public class CourseModified {
	private String courseName;
	private int numberOfStudents;
	private String[] students ;
	//
	CourseModified(){
		courseName = "The Course Name is not Given";
		this.students = new String[5];
	}
	
	CourseModified(String CourseName){
		this.courseName = CourseName;
		this.students = new String[5];
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public int getNumberOfStudents(){
		return this.numberOfStudents;
	}
	
	public void addStudents(String studentName) {
		if ( numberOfStudents >= students.length) {
			String[] temp= new String[students.length +1];
		System.arraycopy(students, 0, temp, 0, students.length);
		this.students = temp;
		}
		this.students[numberOfStudents]= studentName;
		this.numberOfStudents ++;
	}
	
	public void dropStudents(String studentName) {
		for ( int i =0 ; i < this.students.length; i ++ ) {
			if ( this.students[i]== studentName) {
				this.students[i]= null;
				this.numberOfStudents -- ;
				break;
			}
		}
		students = this.resortStudentName(students);
	}
	
	public void getAllStudents() {
		for( int i = 0; i < students.length; i ++ ) {
			System.out.println(students[i]);
		}
	}


	private String[] resortStudentName(String[] students) {
		String newStudents[] = new String[students.length-1];
		for ( int i =0; i < newStudents.length;i++ ) {
			for ( int j = 0; j < students.length ; j++ ) {
				if (students[j]!=null) {
					newStudents[i] = students[j];
					students[j]=null;
					break;
							}
			}
		}
		return newStudents;
	}
	

}
