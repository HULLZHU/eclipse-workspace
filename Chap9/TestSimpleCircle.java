
public class TestSimpleCircle { //public class 

	public static void main(String[] args) {
		// ��circle1 ����Ϊ SimpleCircle ���ͣ��������͸���SimpleCircle class�ڵ��߼�����ȷ��������new�ڶ��ڴ������circle1����
        // new : create an object from the constructor
		SimpleCircle circle1 = new SimpleCircle(2);
		System.out.println("The area of the circle is : " +circle1.getArea());
		// TODO Auto-generated method stub
		System.out.println(Circle.getArea(1));

	}
	}
	
	//�����º�������Ƕ���ں������������У������ַ���ʹ����������������ã�
	//��һ�����static���ɾ�̬��Ա����������������ʱ�����ȵ��þ�̬��Ա��
	// �ڶ��� ֱ���������������������������Ĵ��ڣ�ֱ�ӹ�����
	//���¿�ɾ�ɲ�ɾ����Ϊnew SimpleCircleҲ���Դ����������
	   class SimpleCircle2{//public static class
		double radius;
		//������ø���ʱ�������ڴ��ݲ�������Ĭ��radius=1��ΪĬ�ϲ���
		SimpleCircle2(){
			radius = 1;
		}
		//������ø����ʱ�������ں��в������������ڵĲ�����Ϊ����������ʵ����
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


