
public class Demo01_01 {
	public static void main(String [] args) {
		int [] a = { 1,2 };
		swap(a[0],a[1]);
		System.out.println("After swap a[0] = "+ a[0]+", a[1]=" + a[1]);
	}
    //��Ϊreference variable 'a' is not passed into the method 'swap', ����swap֮��'a'��Ϊһ��object����property���ᱻӰ�� 
	private static void swap(int i, int j) {
		int temp = i;
		i =j ;
		j= temp;
	}
}
