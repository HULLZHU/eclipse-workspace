import java.io.*;
public class TestDataStream {
	public static void main(String[]args) {
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))){
			
			for ( int i = 0 ; i< 100 ; i ++ ) {
				int number = (int)(100 * Math.random());
				output.writeInt(number);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("The file will be newly created.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int sum = 0;
		try(DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"))){
			int value ;
			while ( (value = input.read()) !=-1){
				value = input.readInt();
				sum += value;
				System.out.println(value + " ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			System.out.println("\n" +sum);
		}
	}

}
