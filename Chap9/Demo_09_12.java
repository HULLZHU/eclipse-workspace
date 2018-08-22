
public  class Demo_09_12 {
	public static void main(String[] args) {
		A a = new A("Happy");
		a.print();
	}

}
   class A {
	   String s;
	   A (String news){
		   s = news;
	   }
	   public void print() {
		   System.out.println(s);
	   }
   }
