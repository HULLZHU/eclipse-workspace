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
		// 也可以改为throw new Exception("New info from method1")，但是在catch(Exception ex)中定义的
		//ex将停止被传递，而ex最开始由method2()抛出，因此，throw new Exception("New info from method1")
		//的实质是抛出一个全新的与之前程序运行无关的异常，仅仅抛出当前方法产生的异常，并附加一条语句
		}
	}
	public static void method2() throws Exception{
		throw new Exception("New info from method2");

	}
}
