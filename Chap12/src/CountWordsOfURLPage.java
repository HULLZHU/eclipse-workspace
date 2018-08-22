import java.io.IOException;
import java.net.*;
import java.util.*;
public class CountWordsOfURLPage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the target URL address.");
		String URLString = input.nextLine();
		try {
			URL sourceAddress = new URL(URLString);
			Scanner inputIO = new Scanner(sourceAddress.openStream());
			ArrayList<String> words = new ArrayList<>();
			while ( inputIO.hasNext()) {
				String str  = inputIO.next();
				words.add(str);
			}
			
			System.out.println("The number of words in your URL is " + words.size());
		} catch (MalformedURLException e) {
			System.out.println("Sorry to inform you that your url is illegal.\n Please check it again.");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("Unknow Exception. Please report the Exception info to your service provider.");
		}
		

	}

}
