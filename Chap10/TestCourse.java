
public class TestCourse {

	public static void main(String[] args) {
		Course Mathematics = new Course("Mathematics");
		Mathematics.addStudents("ZhuHe");
		Mathematics.addStudents("Linziqi");
		Mathematics.dropStudents("ZhuHe");
		System.out.println(Mathematics.getStudentsNumber());
		Mathematics.getAllStudentsName();
		// TODO Auto-generated method stub

	}
	
}
