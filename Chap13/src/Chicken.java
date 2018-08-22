
public class Chicken extends Animal implements Edible {
	@Override
	public String howToEat() {
		return "Chiken: Fry it";
	}

	@Override
	public String sound() {
		return "Chiken: gogo -ong";
	}
}
