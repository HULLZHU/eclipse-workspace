import java.io.*;
import java.util.*;
public class ProcessScoresFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the files including scores .");
		File scoresFile = new File(input.next());
		
		try ( Scanner inputIO = new Scanner(scoresFile);)
				{
			inputIO.useDelimiter("[\\D&&\\W]");
			double sumOfScores = 0;
			int countOfScores = 0;
			while ( inputIO.hasNextLine()) {
				String str = inputIO.next();
				System.out.println(str);
				//�ڶ�ȡ�����У����ܻ����һЩδ֪���󣬵���whileѭ���޷��˳�
				//����tryץȡ�����޷�Ԥ֪�Ĵ���
				try {
				sumOfScores +=Double.parseDouble(str);
				}
				catch (Exception ex) {
					break;
				}
				countOfScores++;
				System.out.println("sumOfScores: "+ sumOfScores);
				System.out.println("countOfScores: " + countOfScores);
				}
				System.out.println("The total : "+sumOfScores);
				System.out.println("The average : " + sumOfScores/countOfScores);
				
			}
		}
}
