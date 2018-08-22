
public class PE_5_43 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 2;
		int count = 0;
		while ( i <= 7) {
			while ( j > i && j<=7 ) {
				System.out.println(i + " "+ j);
				count ++;
				j++;	
			}
			i++;
			j = i +1;
		}
    System.out.println("The count is " + count);
	}

}
