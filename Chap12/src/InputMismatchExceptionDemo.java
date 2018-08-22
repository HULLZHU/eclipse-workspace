import java.util.*;
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.println("Enter an integer: " );
				//如果输入的数是非整数，则JRE会自动抛出一个InputMismatchException()对象
				int number = input.nextInt();
				//对于非正数情况手动考虑异常情况
				if (number <= 0)
					throw new InputMismatchException();
				System.out.println("The number is  : " + number);
				continueInput = false;
			}		
			catch (InputMismatchException ex) {
				System.out.println("Try again: please enter an positive integer");
				input.nextLine();
			}
		}
		while (continueInput);
	}
}
