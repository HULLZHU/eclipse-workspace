import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ScanGroupingSymbols {
	public static void main(String[]args) {
		File file = new File("Point.txt");
		Stack<Character> stack = new Stack<>();
		String str = "";
		
		try( Scanner input = new Scanner(file)){
			while ( input.hasNext()) {
				str = str + input.nextLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		System.out.println(str);  
		
		boolean rightGrouping = true;
		try {
		for ( int i = 0 ; i < str.length() ; i ++) {
				if (str.charAt(i)=='('||str.charAt(i)=='{'||str.charAt(i)=='[') {
					stack.push(str.charAt(i));
				}
				
				else if (str.charAt(i)==')'||str.charAt(i)==']'||str.charAt(i)=='}') {
					if ( str.charAt(i)==')'&&(stack.peek()=='{'||stack.peek()=='[')) {  
						rightGrouping = false; 
						System.out.println(rightGrouping);
						break;
						} 
					else if (str.charAt(i)==']'&&(stack.peek()=='{'||stack.peek()=='(')) {
						rightGrouping = false;
						System.out.println(rightGrouping);
						break;
					}
					else if (str.charAt(i)=='}'&&(stack.peek()=='['||stack.peek()=='(')) {
						rightGrouping =false;
						break;
					}
					else  
						stack.pop(); 
				}  
		}   
		}
		catch (Exception ex) {
			rightGrouping = false;
		} 
		
		while ( !stack.isEmpty())
			System.out.print(stack.pop()+" ");
		System.out.println(rightGrouping); 
	
		 
		  
		
	}

}
