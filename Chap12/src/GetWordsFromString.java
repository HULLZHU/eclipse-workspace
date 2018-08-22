import java.util.*;

public class GetWordsFromString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "Hello Hello Bay Bay Bay bay bay ";
		String[] words = s1.split("[\\D&&\\W]");
		for (int i = 0; i< words.length ; i ++) {
			System.out.println(words[i]);
		}
		System.out.println(words.length);
		

	}

}
