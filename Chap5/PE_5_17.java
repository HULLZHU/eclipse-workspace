import java.util.*;
public class PE_5_17 {
	
	public static void main(String[] args) {
		
		//˼·�� ����������ѭ��Ƕ�׳��Գ����ұߵ���ֵ
		//       ��ʹ����ͬ�ķ��������ߵ���ֵ
		//        ����취���ո�
		
		System.out.println("please input a integer");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		int array = 1;
		
		while ( array <= number)
		{   
			int i = 1;
			int j = array;
			
			//����ո�
			int space = 0;
			 //����ո�
			while ( space <= number - array)
			{
				System.out.print("  ");
				space++;
			}
			
			
			while ( i <= array)
			{ 
				//����Գ��������ֵ
				while( j != 1) 
			{
			System.out.print(j+" ");
			j--;
			}
				//����Գ����ұ���ֵ
			System.out.print(i + " " );
			i++;
			}
			array++;
			System.out.println("");
			
			
			}
		}

	}

