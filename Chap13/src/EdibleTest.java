
public class EdibleTest  {

	public static void main(String[] args) {
		Edible stuff = new Chicken();
		System.out.println(eat(stuff));
		stuff = new Apple();
		System.out.println(eat(stuff));
		stuff = new Broccoli();
		System.out.println(eat(stuff));
	}

	private static String eat(Edible stuff) {
		return stuff.howToEat();
	}
}
