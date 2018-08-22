import java.util.*;
public class TestBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name, age, weight and height.");
		String name = input.next();
		int age = input.nextInt();
		double weight = input.nextDouble();
		double height = input.nextDouble();
		BMI myBMI = new BMI(name, age, weight, height);
		System.out.println("Status: "+ myBMI.getStatus());
		System.out.println("BMI: " + myBMI.getBMI());

	}

}
