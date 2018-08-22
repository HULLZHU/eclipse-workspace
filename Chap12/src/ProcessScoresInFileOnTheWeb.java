import java.util.*;
import java.io.*;
import java.net.*;
public class ProcessScoresInFileOnTheWeb {
	public static void main(String[] args) {
		try {
			URL sourceAddress = new URL ("http://cs.armstrong.edu/liang/data/Scores.txt");
			Scanner input = new Scanner(sourceAddress.openStream());
			double sumOfScores = 0;
			double countOfScores = 0;
			while(input.hasNextDouble()) {
				sumOfScores += input.nextDouble();
				countOfScores++;
			}
			input.close();
			System.out.println("The average scores = " + sumOfScores/countOfScores);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
