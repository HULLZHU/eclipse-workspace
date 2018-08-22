
public class Demo_01_04 {

	public static void main(String[] args) {
		R r1 = new R();
		R r2 = new R();
		System.out.println("r1's i = "+ r1.i +" and j="+r1.j);
		System.out.println("r2's i = "+ r2.i +" and j="+r2.j);
		// i =2 ; j =1
		// i =2 ; j =1
		//因为static int i = 0且 int j = 0， 对于static 而言，调用后不归初始值，对于no-static而言，归初始值
	}

}
