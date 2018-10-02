import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WebCrawler {
	public static void main(String[]args) throws IOException {
		String url = "https://www.quora.com/Should-I-get-a-CQF-instead-of-a-CS-degree#";
		crawler(url);
	}

	private static void crawler(String startingURL) throws IOException {
		//first define 2 sets to store urls
		TreeSet<String> setOfPendingURLs = new TreeSet<String>();
		HashSet<String> setOfTraversedURLs = new HashSet<String>();
		setOfPendingURLs.add(startingURL);//add the first URL
		
		while ( !setOfPendingURLs.isEmpty()&&setOfTraversedURLs.size()<=100) {
			 String urlString = setOfPendingURLs.pollFirst();
			 if (setOfTraversedURLs.contains(urlString)) {
				 setOfTraversedURLs.add(urlString);
				 System.out.println("Craw "+urlString);
			 }
			 
			 for (String s : getSubURLs(urlString)) {
				 if (!setOfPendingURLs.contains(s))
					 setOfPendingURLs.add(s);
			 }
		
		}
	}

	private static HashSet<String> getSubURLs(String urlString) throws IOException {
		HashSet<String> subURLs = new HashSet<String>();
		URL url = new URL(urlString);
		try {
		Scanner input = new Scanner(url.openStream());
		int current = 0;
		while ( input.hasNext()) {
			String line = input.nextLine();
			current = line.indexOf("https:",current);
			while (current > 0) {
				int endIndex = line.indexOf("\"", current);
				if (endIndex > 0 ) {
					subURLs.add(line.substring(current, endIndex));
					current = line.indexOf("https:",endIndex);
				}
				else
					current = -1;
			}
		}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return subURLs;
	}


}
