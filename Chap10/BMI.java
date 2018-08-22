
public class BMI {
	private String name;
	private int age;
	private double height;
	private double weight;
	private final static double KILOGRAMS_PER_POUND = 0.45359237;
	private final static double METERS_PER_INCH = 0.0254;
	public BMI(){
		
	}
	
	public BMI(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public BMI(String name, double weight, double height){
		this.name =name;
		this.weight = weight;
		this.height = height;
		
	}
	
	public double getBMI() {
		double bmi = weight*this.KILOGRAMS_PER_POUND/(height*this.METERS_PER_INCH)*(height*this.METERS_PER_INCH);
		return Math.round(bmi*100)/100;
	}
	
	public String getStatus() {
		double bmi = getBMI();
		if ( bmi < 18.5 )
			return "UnderWeight.";
		else if ( bmi < 25 )
			return "Normal";
		else if ( bmi < 30 )
			return "Overweight";
		else
			return "Obese";
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return this.age;
	}
	public double getWeight() {
		return weight;
	}
	public double getHeight() {
		return height;
	}
}
