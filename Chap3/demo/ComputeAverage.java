package demo;

import java.util.*;

public class ComputeAverage {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		Scanner input2=new Scanner (System.in);
		Scanner input3=new Scanner(System.in);
		
		
		System.out.println("Enter three number");
		//�����û�������������
		double
		 number1=input.nextDouble(),
		 number2=input2.nextDouble(),
		 number3=input3.nextDouble(),
		 average=(number1+number2+number3)/3;
		
		//��ʾ���
		
		System.out.println("The average of"+number1+"and"+number2+"and"+number3+"is"+average);
		

	}

}
