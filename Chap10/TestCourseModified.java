import java.util.*;
public class TestCourseModified {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CourseModified myCourse = new CourseModified("Math");
		myCourse.addStudents("Wang");
		myCourse.addStudents("Li");
		myCourse.addStudents("Chen");
		myCourse.addStudents("Lin");
		myCourse.addStudents("Lin");
		myCourse.addStudents("Lin");
		myCourse.addStudents("Lin");
		myCourse.dropStudents("Wang");
		myCourse.getAllStudents();

	}

}
