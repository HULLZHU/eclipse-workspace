
public class PE_08_18 {

	public static void main(String[] args) {
		int[][] m = {
				{1,2},
				{3,4},
				{5,6},
				{7,8},
				{9,10},
		};
		
		for ( int i=0; i < 20; i ++ ) {
			int temp1 = (int)(5*Math.random());
			int temp2 = (int)(5*Math.random());
			int store1=0, store2=0;
			store1 = m[temp1][0];
			store2 = m[temp1][1];
			m[temp1][0]=m[temp2][0];
			m[temp1][1]=m[temp2][1];
			m[temp2][0]=store1;
			m[temp2][1]=store2;
		}
		
		for ( int i =0; i < m.length;i++) {
			for ( int j =0; j < m[0].length;j++) {
				System.out.print("  "+ m[i][j]);
				if ( j == 1)
				  System.out.println("");
			}
		}
				
		}
		// TODO Auto-generated method stub

	}


