import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
public class BindingDemo {
	public static void main(String[] args) {
		DoubleProperty d1 = new SimpleDoubleProperty(1);
		DoubleProperty d2 = new SimpleDoubleProperty(2);
		d1.bind(d2.multiply(2));
		
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		d2.setValue(70.2);
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
	}
}
