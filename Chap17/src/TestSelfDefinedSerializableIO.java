import java.io.*;
public class TestSelfDefinedSerializableIO {
	public static void main(String[] args) throws ClassNotFoundException {
		try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("obj2.dat"))) {
			output.writeObject(new ATM(100));
			output.writeObject(new ATM(150));
			output.writeObject(new ATM(200));
		}
		catch (Exception ex) {
			System.out.println("Something goes wrong");
		}
		
		try(ObjectInputStream input = new ObjectInputStream(new FileInputStream("obj2.dat"))){
			ATM obj = (ATM) input.readObject();
			ATM obj2 = (ATM) input.readObject();
			ATM obj3 = (ATM) input.readObject();
			
			System.out.println(obj);
			System.out.println(obj2);
			System.out.println(obj3);
			
			double[] balance1 =  obj.getBalances();
			double[] balance2 =  obj2.getBalances();
			double[] balance3 = obj3.getBalances();
			for ( int i = 0 ; i <balance1.length ; i ++ ) {
				System.out.println(balance1[i]);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
