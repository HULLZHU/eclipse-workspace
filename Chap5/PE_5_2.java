import java.util.Scanner;

public class PE_5_2 {

	public static void main(String[] args) {
		
		//1到15的十个随机加法题；计时器；
		
		System.out.println("Now here are ten addition quiz");
		
		int count_all = 0 ;
		
		int count_right = 0;
		
		double t1 = System.currentTimeMillis();
		
		int a = (int)(15*Math.random())+1;
		int b = (int)(15*Math.random())+1;
		int answer = 1;
		Scanner input = new Scanner(System.in);
		
		while ( answer!=0)
		{
			System.out.println("what is the answer of "+ a+ "+"+b+"?");
			
			answer = input.nextInt();
			
			if (answer == a+b)
			{
				count_right ++;
			}
			count_all ++;
		    a = (int)(15*Math.random())+1;
		    b = (int)(15*Math.random())+1;
		}
		double t2 =System.currentTimeMillis();
		System.out.println("Here are "+( count_all-1)+"quiz and "+count_right+" are right");
		System.out.println("The time you use is " + (int)(t2-t1)/1000);
		
		// TODO Auto-generated method stub

	}

}
