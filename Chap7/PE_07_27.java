
public class PE_07_27 {

	public static void main(String[] args) {
		int[] a = { 1,2,2,3,4,5,5,6,6};
		int[] b = {1,2,2,3,4,5,5,6,6};
		
		boolean isIdentical = true;
		if ( a.length!= b.length) {
			System.out.println("Not identical.");
			System.exit(0);
		}
		else {
			for ( int i = 0; i<a.length;i ++ ) {
				int count1 = 0 ;
				int count2 = 0;
				//compare an element to its belonging set
				for ( int j = 0; j <a.length;j++) {
					if ( a[i]== a[j]) {
						count1++;
					}
				}
				
				//compare an element to another set
				for ( int k=0; k < b.length;k++) {
					if ( a[i]== b[k]) {
						count2 ++;
					}
				}
				
				if (count1 != count2) {
					isIdentical = false;
					break;
				}
			}		
		}
		
		if ( isIdentical) {
			System.out.println("Identical");
		}
		else 
			System.out.println("Not identical.");
		// TODO Auto-generated method stub

	}

}
