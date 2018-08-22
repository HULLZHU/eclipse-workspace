
public class Fan {
	private final int slow =1;
	private final int medium = 2;
	private final int quick = 3;
	private int speed = 0;
	private boolean on = false;
	private String color = "blue";
	private double radius = 5;
	
	public Fan(){	
	};
	//turn on and turn off 
	public void turnOn(){
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public boolean isOn() {
		return on;
	}
	
	//color
	public String getColor() {
		return color;
	}
	
	public void setColor( String newColor) {
		color = newColor;
	}
	
	// radius
	public  double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius =radius;
	}
	
	//speed
	public String getSpeed() {
		if( speed == slow )
			return "slow";
		else if ( speed == medium )
			return "mediu";
		else if ( speed == quick )
			return "quick";
		else
			return "Please set the speed.";
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		if ( on) {
			return " The color: "+ color+"\n The speed: "+this.getSpeed()+"\n The radius: "+radius;
		}
		else
			return "Please turn on the fan.";
	}
	
	
	
	
	
}
