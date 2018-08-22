
public class TestSimpleCircle { //public class 

	public static void main(String[] args) {
		// 将circle1 定义为 SimpleCircle 类型，具体类型根据SimpleCircle class内的逻辑具体确定；利用new在堆内存区存放circle1变量
        // new : create an object from the constructor
		SimpleCircle circle1 = new SimpleCircle(2);
		System.out.println("The area of the circle is : " +circle1.getArea());
		// TODO Auto-generated method stub
		System.out.println(Circle.getArea(1));

	}
	}
	
	//若以下含对象类嵌套在含主方法的类中，有两种方法使其可以在主方法调用：
	//第一：需加static构成静态成员，并在主方法进行时，优先调用静态成员类
	// 第二： 直接在主方法结束后，无视主方法的存在，直接构造类
	//以下可删可不删，因为new SimpleCircle也可以从其他类调用
	   class SimpleCircle2{//public static class
		double radius;
		//如果调用该类时候，括号内传递参数，则默认radius=1作为默认参数
		SimpleCircle2(){
			radius = 1;
		}
		//如果调用该类的时候，括号内含有参数，则将括号内的参数作为参数来进行实例化
		SimpleCircle2(double newRadius){
			radius = newRadius;
		}
		
		double getArea() {
			return radius*radius*Math.PI;
		}
		double getPerimeter() {
			return radius*2*Math.PI;
		}
		void setRadius(double newRadius) {
			radius = newRadius;
		}
	}


