
public class Generate_Random_LowerCaseNumber {

	public static void main(String[] args) {
		
		System.out.println("Now a random lowercase letter will be shown");
		
		int rand_1 = (int) Math.floor(26*Math.random());
		//�����1��ȡֵ��Χ��0-25��26����
		
		int rand_2 = 97 + rand_1;
		//�����2��ȡֵ��Χ��97-122��26����
		
		char rand_Letter = (char) rand_2;
		//�������2��numericalת��Ϊcharacter
		
		System.out.println(rand_Letter);
		
		System.out.println((char)65);
		
		
		// TODO Auto-generated method stub
	}

}
