import java.util.*;
public class PE_5_17 {
	
	public static void main(String[] args) {
		
		//思路： ①首先利用循环嵌套出对称轴右边的数值
		//       ②使用相同的方法求出左边的数值
		//        ③想办法表达空格；
		
		System.out.println("please input a integer");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int array = 1;
		
		while ( array <= number)
		{   
			int i = 1;
			int j = array;
			
			//定义空格
			int space = 0;
			 //输出空格
			while ( space <= number - array)
			{
				System.out.print("  ");
				space++;
			}
			
			
			while ( i <= array)
			{ 
				//输出对称轴左边数值
				while( j != 1) 
			{
			System.out.print(j+" ");
			j--;
			}
				//输出对称轴右边数值
			System.out.print(i + " " );
			i++;
			}
			array++;
			System.out.println("");
			
			
			}
		}

	}

