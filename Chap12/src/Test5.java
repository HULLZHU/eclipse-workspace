import java.awt.List;

public class Test5 {
	public static void main(String[] args) {
		try {
			System.out.println(sum(new int[] {1,2,3,4,5,6}));
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("");
			System.out.println("toString : "+ex.toString());
			System.out.println("get message:"+ex.getMessage());
			
			
			System.out.println("Trace info obtained from getStackTrace");
			StackTraceElement[] traceElements = ex.getStackTrace();
			for ( int i = 0; i < traceElements.length; i ++ ) {
				System.out.print("method"+traceElements[i].getMethodName());
				System.out.print("("+traceElements[i].getClassName()+":");
				System.out.println(traceElements[i].getLineNumber()+")");
			}
		}
	}

	private static int sum(int[] list) {
		int result = 0;
		for (int i = 0; i <list.length; i ++  ) {
			result += list[i+1];
		}
		return result;
	}

}
