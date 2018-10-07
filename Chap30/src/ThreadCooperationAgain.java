import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCooperationAgain {
	private static Math math = new Math();
	
	public static void main(String[] args) {
		String[] students = {"Tom","HeZhu","ZiQi Lin","ZhiYang Lin","QiuQiu","LaLa","Jack","Timmy"};
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new AddStudentAction(students));
		executor.execute(new RemoveStudentAction(students));
		executor.shutdown();
	}
	
	public static class AddStudentAction implements Runnable{
		String[] students;
		

		public AddStudentAction(String[] students) {
			this.students = students;
		}

		@Override
		public void run() {
			while ( true ) {
				Random random1 = new Random();
				int index= random1.nextInt(students.length);
				Random random2= new Random();
				int score = random2.nextInt(100);
				try {
					math.addStudent(students[index], score);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	
	public static class RemoveStudentAction implements Runnable{
		String[] students;

		public RemoveStudentAction(String[] students) {
			this.students = students;
		}

		@Override
		public void run() {
			int index = new Random().nextInt(students.length);
			String name = students[index];  
			math.deleteStudent(name);
		}
	}
	
	
	
	
	
	
	private static class Math{
		private Map<String,Integer> students_score = new TreeMap<>();
		private static Lock lock = new ReentrantLock();
		private static Condition newStudent = lock.newCondition();
		
		public int getStudentsNumber() {
			return students_score.size();
		}
		
		public void deleteStudent(String name) {
			lock.lock();
			try {
				while( this.students_score.containsKey(name) ) {
					System.out.println("The student "+ name + " does not choose the class");
					newStudent.await();
				}
				
				this.students_score.remove(name);
				System.out.println("Now the student "+ name +" is Dropped");
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			finally {
				lock.unlock();
			}
		}
		
		public void addStudent(String name, int score) throws InterruptedException {
			try{
				lock.lock();
			if ( this.students_score.containsKey(name)) {
				Thread.sleep(1000);
				this.students_score.replace(name, score);
				System.out.println("The student " + name+ " score has been replaced"+ " score is added and score is " +this.students_score.get(name));
				newStudent.signalAll();
			}
			
			else {
				Thread.sleep(1000);
				this.students_score.put(name, score);
				System.out.println("The student "+ name+ " score is added and score is " +this.students_score.get(name));
				newStudent.signalAll();
			}
		}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			finally {
				lock.unlock();
			}
			}
		
		
		
	}
}
