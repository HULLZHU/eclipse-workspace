
public class PE_08_03 {

	public static void main(String[] args) {
		char [][] matrix = {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}
		};
		
		int [] correctNum = new int[8];
		for (int row = 0; row < matrix.length ; row ++ ) {
			correctNum[row] = getCorrectNum(matrix[row]);
		}
		String[] studentNames = {"Student0","Student1","Student2","Student3","Student4","Student5","Student6","Student7"};
		//sorting these two arrays
		for ( int i = 0; i <correctNum.length - 1; i ++ ) {
			int currentMin =correctNum[i];
			int currentMinIndex = i;
			for ( int j = i + 1; j< correctNum.length ; j ++ ) {
				if ( currentMin > correctNum[j]) {
					currentMin = correctNum[j];
					currentMinIndex = j ; 
				}
			}
			if (currentMinIndex != i ) {
				correctNum[ currentMinIndex ] = correctNum[i];
				String temp = studentNames[ currentMinIndex ];
				studentNames[ currentMinIndex] = studentNames [i];
				studentNames[i] = temp;
				correctNum[i] = currentMin;
			}
		}
		
		for ( int i =0; i < studentNames.length ; i ++ ) {
			System.out.println(studentNames[i] + ": " + correctNum[i]);
		}
		
		// TODO Auto-generated method stub

	}

	private static int getCorrectNum(char[] cs) {
		char []key = { 'D','B','D','C','C','D','A','E','A','D'};
		int correctNum = 0;
		for ( int i = 0 ; i < cs.length; i ++ ) {
			if (key[i] == cs[i])
				correctNum ++;
		}
		// TODO Auto-generated method stub
		return correctNum;
	}

}
