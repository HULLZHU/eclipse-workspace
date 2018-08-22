import java.util.*;
public class InputMismatchExceptionDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.println("Enter an integer: " );
				//�����������Ƿ���������JRE���Զ��׳�һ��InputMismatchException()����
				int number = input.nextInt();
				//���ڷ���������ֶ������쳣���
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
