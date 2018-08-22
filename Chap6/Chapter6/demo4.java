package Chapter6;

public class demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			String s1 = 1234+"";
			String s2 = "";
			int count = 0;
			while ( count <= s1.length()-1) {
				s2 = s2+ s1.charAt(s1.length()-1-count);
				count ++;
			}
		
			System.out.println(s2);

	}

}
