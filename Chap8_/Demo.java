import java.util.Scanner;

public class Demo{
	public static void main(String []args) {
		int[][]matrix = {{1,1,0},{1,0,1}};
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y= input.nextInt(); 
		if ( matrix[x][y]==1)
			matrix[x][y] = 0;
		else 
			matrix[x][y]=1;
		System.out.println(matrix[x][y]);
	}
}
