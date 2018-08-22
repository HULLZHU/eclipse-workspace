
public class Course {
	//data fields
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents ;
	//constructors and methods
	//default constructor
	public Course() {
	}
	//construct with Course Name
	public Course(String courseName){
		this.courseName = courseName;
	}
	//获取课程名称
	public String getCourseName() {
		return courseName;
	}
	//删除学生
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
	//增加学生
	public void addStudents(String studentName) {
		for ( int i = 0; i < students.length ; i ++ ) {
			if ( students[i]==null) {
				students[i] = studentName;
				this.numberOfStudents++;
				break;
						} 
			if ( students[i] != null && i == students.length-1) {
				System.out.println("The course is fully enrolled.");
			}
		}
	}
	//对报名学生重新排序(内部方法，不做外部调用）
	private String[] resortStudentName(String[]students) {
		String newStudents[] = new String[100];
		for ( int i =0; i < newStudents.length; ) {
			for ( int j = 0; j < students.length ; j++ ) {
				if (newStudents[j]!=null) {
					newStudents[i] = students[j];
					i++;
							}
			}
		}
		return newStudents;
	}
	//获取所有学生的名单
	public void getAllStudentsName() {
		for ( int i = 0; i < students.length ;i++) {
			
			if ( students[i]!=null) {
			System.out.printf("%12s",students[i]);
			}
			if ( (i+1)%5==0)
				System.out.println("");
			if (students[i]==null)
				break;
			}
	}
	//获取学生人数
	public int getStudentsNumber() {
		return this.numberOfStudents;
	}
	
	
	

}
