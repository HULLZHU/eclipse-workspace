import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountKeyWordsInJavaSourceFile {
	public static void main(String[]args) {
		File file = new File("TestMap.java");
		  String[] keywordString = { "abstract", "finally", "public", "boolean",
			        "float", "return", "break", "for", "short", "byte", "goto", "static",
			        "case", "if", "super", "catch", "implements", "switch", "char",
			        "import", "synchronized", "class", "instanceof", "this", "const",
			        "int", "throw", "continue", "interface", "throws", "default", "long",
			        "transient", "do", "native", "try", "double", "new", "void", "else",
			        "package", "volatile", "extends", "private", "while", "final",
			        "protected", "true", "null" };
		  
		  Map<String,Integer> map = new TreeMap<String,Integer>();
		  for ( int i = 0 ; i < keywordString.length ; i ++ ) {
			map.put(keywordString[i], 0);
		  }
		
		
		
		try {
			int count = 0;
			Scanner input = new Scanner(file);
			String text = "";
			while (input.hasNext()) {
				String line = input.nextLine();
				line = stripLineComments(line);
		        line = stripLineStringLiterals(line);
		        text += line+ " ";
			}
			
			text = stripParagraghComments(text);
			String[] tokens = text.split("[ \\[,()\\]]");
			for ( String token : tokens) {
				if (map.containsKey(token))
					count ++;
			}
			System.out.println(count);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	private static String stripParagraghComments(String text) {
		// TODO Auto-generated method stub
		int start = text.indexOf("/*");
		int end = text.indexOf("*/");
		
		while (start > 0 && end >0) {
			text = text.substring(0, start) + text.substring(end+1);
			start = text.indexOf("/*");
		    end = text.indexOf("*/");
		}
		
		return text;
	}

	private static String stripLineStringLiterals(String line) {
		int start = line.indexOf("\"");
		int end = line.indexOf("\"");
		while ( start > 0 && end > 0) {
			line = line.substring(0, start) + line.substring(end + 1);
			start = line.indexOf("\"");
			end = line.indexOf("\"");
		}
		return line;
	}

	private static String stripLineComments(String line) {
		int index = line.indexOf("//");
		if ( index < 0 )
			return line;
		else
			return line.substring(0,index);
	}

}
