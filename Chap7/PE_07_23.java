
public class PE_07_23 {

	public static void main(String[] args) {
		boolean[] isOpen = new boolean [100];
		for ( int i = 0 ; i < isOpen.length;i++) {
			isOpen[i] = false;
		}
		
		for ( int i = 0; i < isOpen.length; i ++ ) {
			for ( int j = i; j < isOpen.length; j ++ ) {
				if (isOpen[j]) {
					isOpen[j] = false;
				}
				else if ( !isOpen[j]) {
					isOpen[j] = true;
				}
			}
		}
		
		for ( boolean e : isOpen) {
			if (e)
				System.out.print("Open   ");
			else 
				System.out.print("Closed   ");
		}
		int count = 0 ;
		for ( int i = 0 ; i <isOpen.length ; i ++) {
			if ( isOpen[i])
				count ++;
		}
		System.out.println("");
		System.out.println("OpenNumber:"+count);
		// TODO Auto-generated method stub

	}

}
