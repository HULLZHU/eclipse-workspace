import java.util.*;;
public class Case_Study_08_05 {

	public static void main(String[] args) {
		System.out.println("Please input the quiz number.");
		Scanner input = new Scanner(System.in);
		int columns = input.nextInt();
		System.out.println("Please input the key.");
		char [] key =new char[columns];
		for ( int i = 0;i<key.length;i++) {
			key[i] = (input.next()).charAt(0);
		}
		for ( int i = 0; i<key.length;i++)
			System.out.println(key[i]);
		System.out.println("How many students do you have?");
		int rows = input.nextInt();
		char [][]  answers =new char[rows][columns];
		for ( int i =0; i < answers.length; i ++ ) {
			for ( int j = 0 ; j < answers[i].length;j++) {
				answers[i][j] = (input.next()).charAt(0);
			}
		}
		for ( int i =0; i < answers.length; i ++ ) {
			int correctCount = 0;
			for ( int j = 0 ; j < answers[i].length;j++) {
				if ( answers[i][j] == key[j])
					correctCount ++;
			}
			System.out.println("Student: "+ i +" "+ correctCount);
		}
		
		// TODO Auto-generated method stub

	}

}
