public class ChainedExceptionDemo {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public static void method1()throws Exception{
		try {
			method2();
		}
		catch (Exception ex) { 
		throw new Exception("New info from method1",ex);
		// Ҳ���Ը�Ϊthrow new Exception("New info from method1")��������catch(Exception ex)�ж����
		//ex��ֹͣ�����ݣ���ex�ʼ��method2()�׳�����ˣ�throw new Exception("New info from method1")
		//��ʵ�����׳�һ��ȫ�µ���֮ǰ���������޹ص��쳣�������׳���ǰ�����������쳣��������һ�����
		}
	}
	public static void method2() throws Exception{
		throw new Exception("New info from method2");

	}
}
