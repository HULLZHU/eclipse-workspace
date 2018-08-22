
public class Broccoli extends Vegetables implements Edible {
	public Broccoli() {
		super();
	}
	
	public Broccoli(String color, boolean filled) {
		super (color, filled);
	}

	@Override
	public String howToEat() {
		// TODO Auto-generated method stub
		return "Wash Cut Fried BlackPepper Sauce";
	}

}
