
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		System.out.println("The number of object is "+ CircleWithStaticMembers.numberOfObjects);
		// create c1
		CircleWithStaticMembers c1 = new CircleWithStaticMembers(2);
		System.out.println("After creating objects, the number of objects is : " + CircleWithStaticMembers.numberOfObjects);
        //��ΪnumbersOfObejects�����Ƿ�װ��private����˿��Ա�����ʵ���۸ģ����²���ȫ������Ϊprivate�������´������̳����﷨����
		CircleWithStaticMembers.numberOfObjects = 100;
	}

}
