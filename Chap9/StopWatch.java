class StopWatch {
	private long startTime;
	private long endTime;
	 static double totalTime=0;
	 static long count=0;
	
	public StopWatch( ){
		startTime = System.currentTimeMillis();
	}
	public void start(){
		startTime = System.currentTimeMillis();
	}
	
	public void end() {
		endTime = System.currentTimeMillis();
	}
	
	public long getElaspedTime() {
		count++;
		totalTime += (endTime -startTime);
		return endTime - startTime;
	}
	
	public double getAverageTime() {
		return totalTime/count;
	}
	
	public void initializeMemory() {
		count = 0;
		totalTime =0;
	}
	
	public static double getTotalTime() {
		return totalTime;
	}
	public static double getCount() {
		return count;
	}
}
