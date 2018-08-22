
public class PersonTest implements Comparable<PersonTest>{
	private int  id ;
	public PersonTest () {
		id = 0;
	}
	
	public PersonTest(int newID) {
		id = newID;
	}
	
	public int getID() {
		return id;
	}
	
	@Override
	public int compareTo(PersonTest id) {
		if ( this.getID() < id.getID())
			return -1;
		else if ( this.getID() > id.getID())
			return 1;
		else
			return 0;
	}
	
	public static void main(String args[]) {
		PersonTest[] persons = {new PersonTest(3),new PersonTest(4), new PersonTest(1)};
		java.util.Arrays.sort(persons);
		for ( int i = 0; i < persons.length ; i ++ ) {
			System.out.println(persons[i].getID());
		}
 	}
	
	

}
