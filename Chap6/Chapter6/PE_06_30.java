package Chapter6;

public class PE_06_30 {

	public static void main(String[] args) {
		System.out.println("Now roll the dice");
		result();
		
	}

	
	public static void result ( ) {
		int randomNum1 = (int)(6*Math.random()+1);
		int randomNum2 = (int)(6*Math.random()+1);
		int tempNum = 0;
		int count = 1;
		if ( count == 1) {
			if (randomNum1 + randomNum2 == 2 || randomNum1+randomNum2 == 3 || randomNum1 + randomNum2 == 12 )
				System.out.println(randomNum1+"+"+randomNum2+"="+(randomNum1+randomNum2)+"Win");
			else if ( randomNum1 + randomNum2 == 7 || randomNum1 + randomNum2 == 11 )
				System.out.println(randomNum1+"+"+randomNum2+"="+(randomNum1+randomNum2)+"Lose");
			else {
				System.out.println(randomNum1+"+"+randomNum2+"="+(randomNum1+randomNum2)+"continue");
				count ++;
				tempNum = randomNum1 + randomNum2;
			}
		}
		while ( count >= 2) {
			randomNum1 =(int)(6*Math.random()+1);
		    randomNum2 =(int)(6*Math.random()+1);
		    if ( tempNum == randomNum1 + randomNum2) {
		    	System.out.println(randomNum1+"+"+randomNum2+"="+(randomNum1+randomNum2)+"Win");
		    break;
		    }
		    else if ( randomNum1 + randomNum2 == 7) {
		    	System.out.println(randomNum1+"+"+randomNum2+"="+(randomNum1+randomNum2)+"Lose");
		    	break;
		    	}
		    else 
		    	count++;
		    	
		}
		
	}
}