
public class PE_5_33_PerfectNumber {

	public static void main(String[] args) {
		for(int num=2;num<10000;num++){
			int sum=0;
			//²éÕÒÒòÊý
			for(int factor=1;factor<num;factor++){
				
			if(num % factor==0){
				sum += factor;
			}
		}
			if(sum==num)
			    System.out.println(num);
		}
		// TODO Auto-generated method stub

	}

}
