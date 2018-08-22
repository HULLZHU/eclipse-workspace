
public class Generate_Random_LowerCaseNumber {

	public static void main(String[] args) {
		
		System.out.println("Now a random lowercase letter will be shown");
		
		int rand_1 = (int) Math.floor(26*Math.random());
		//随机数1的取值范围是0-25共26个数
		
		int rand_2 = 97 + rand_1;
		//随机数2的取值范围是97-122共26个数
		
		char rand_Letter = (char) rand_2;
		//将随机数2由numerical转换为character
		
		System.out.println(rand_Letter);
		
		System.out.println((char)65);
		
		
		// TODO Auto-generated method stub
	}

}
