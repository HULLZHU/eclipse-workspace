
public class Time {
	private byte hours;
	private byte minutes;
	private byte seconds;
	
	public Time() {
		long elaspedMilliSeconds = System.currentTimeMillis();
		long elaspedSeconds = elaspedMilliSeconds / 1000;
		seconds = (byte)(elaspedSeconds%60);
		long elaspedMinutes = elaspedSeconds/60;
	    minutes = (byte)(elaspedMinutes%60);
		long elaspedHours = elaspedMinutes/60;
		long hours  = elaspedHours%60;
		
	};
	
	public Time( byte newHour, byte newMinutes, byte newSeconds ) {
		this.hours = newHour;
		this.minutes = newMinutes;
		this.seconds = newSeconds;
	}
	
	public byte getHour() {
		return hours;
	}
	
	public byte getMinute() {
		return (byte) minutes;
	}
	
	public byte getSeconds() {
		return (byte) seconds;
	}
	
	public void setTime ( long elaspedMilliSeconds) {
		long elaspedSeconds = elaspedMilliSeconds / 1000;
		seconds = (byte)(elaspedSeconds%60);
		long elaspedMinutes = elaspedSeconds/60;
	    minutes = (byte)(elaspedMinutes%60);
		long elaspedHours = elaspedMinutes/60;
		long hours  = elaspedHours%60;
		
	}

}
