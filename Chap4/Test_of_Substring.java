import java.util.*;

public class Test_of_Substring {

	public static void main(String[] args) {
		
		System.out.println("Please input a sentence");
		
		Scanner input = new Scanner(System.in);
		
		String str1 = input.nextLine();
		
		String str2 = str1.substring(0, 12);
		
		System.out.println("The substring of this sentence should be ".concat(str2));
		
		
		// TODO Auto-generated method stub

	}

}
