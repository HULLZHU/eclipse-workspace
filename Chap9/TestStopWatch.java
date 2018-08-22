import java.util.Arrays;

public class TestStopWatch {

	public static void main(String[] args) {
		StopWatch myTime = new StopWatch();
		//generate an array 
		double[] list = new double[10000];
		// start test
		for ( int i = 0; i < 100 ; i++) {
			// fill the array with random numbers
			for ( int k = 0 ; k < list.length ; k ++ ) {
				list[k] = 10000*Math.random();
			}
		myTime.start();
		Arrays.sort(list);
		myTime.end();
		System.out.println("The elasped time of this test is " + myTime.getElaspedTime()+ " milliseconds");
		System.out.println("Average time :"+myTime.getTotalTime()+"/"+myTime.getCount()+" is "+ myTime.getAverageTime());
		}
	}

}
