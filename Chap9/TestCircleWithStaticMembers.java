
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("The number of object is "+ CircleWithStaticMembers.numberOfObjects);
		// create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers(2);
		System.out.println("After creating objects, the number of objects is : " + CircleWithStaticMembers.numberOfObjects);
        //因为numbersOfObejects并不是封装成private，因此可以被其他实例篡改，导致不安全；若改为private，则以下代码立刻出现语法错误
		CircleWithStaticMembers.numberOfObjects = 100;
	}

}
