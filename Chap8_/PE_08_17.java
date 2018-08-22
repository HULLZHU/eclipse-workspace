import java.util.*;
public class PE_08_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[][] borrowers = {
				{0,  100.5, 0,  0,  320.5},
				{0,  0    , 40,  85, 0},
				{125,0    , 0 ,  75, 0},
				{125,0    , 0 ,   0, 0},
				{0  ,0    ,125,   0, 0}
		};
		double [] balances = {25, 125, 175, 75, 181};
		System.out.println("Please give a dangerous limit.");
		double limit = input.nextDouble();
		double[] assets = new double[5];
		//compute assets
		for ( int i = 0 ; i < borrowers.length ; i ++ ) {
			for ( int j = 0; j < borrowers[i].length; j ++ ) {
				assets[i] = borrowers[i][j]+assets[i];
			}
			assets[i] = assets[i] + balances[i];
		}
		
		//print banks' assets table
		System.out.println("Bank0   Bank1   Bank2   Bank3   Bank4 ");
		for (int i = 0; i < assets.length; i ++ )
			System.out.print( assets[i]+"   ");
		System.out.println("");
		
		//check banks' financial status
		boolean[] hasCheck = new boolean[5];
		for ( int i = 0; i < assets.length ; ) {
			if ( assets[i] < limit&&!hasCheck[i]) {
				System.out.println("The bank "+ i +" is unsafe");
				for ( int j=0; j < borrowers[i].length; j ++ ) {
					if ( borrowers[i][j]==0) {
						//adjust the assets and update borrowers list
						assets[j] = assets[j] - borrowers[j][i];
						borrowers[j][i] = 0;
					}
				}
				hasCheck[i] = true;
				i = 0;
			}
			else
				i++;
		}
		System.out.println("Followings is newest assets table.");
		System.out.println("Bank0   Bank1   Bank2   Bank3   Bank4 ");
		for (int i = 0; i < assets.length; i ++ )
			System.out.print( assets[i]+"   ");
	}
	

}
