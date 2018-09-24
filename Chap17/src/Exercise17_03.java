import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise17_03 {
	public static void main(String[]args) throws IOException {
		DataOutputStream output = new DataOutputStream(new FileOutputStream("hello.dat"));
		output.writeInt(10);
		output.writeInt(100);
		for (int i = 0 ; i  < 100 ; i ++ ) {
			output.writeInt((int)(Math.random()*100));
		}
		
		DataInputStream input = new DataInputStream(new FileInputStream("hello.dat"));
		int sum = 0;
		int value = 0;
		try {
		System.out.print(input.readInt()+" ");
		System.out.println(input.readInt()+ " ");
		System.out.println(input.readInt()+ " ");
		System.out.println(input.readInt()+ " ");
		System.out.println(input.readInt()+ " ");
		System.out.println(input.readInt()+ " ");
		System.out.println(input.readInt()+ " ");
		while(true) {
			value = input.readInt();
			System.out.println(value);
			sum += value;
		}
		}
		catch(Exception ex) {
			System.out.println("Sum is " + sum);
			System.out.println("End");
		}
	}
}
