import java.util.Date;
public class House implements Comparable<House> {
	private int id;
	private double area;
	private Date dateBuilt;
	
	public House (int id, double area) {
		this.id = id;
		this.area = area;
		dateBuilt = new Date();
	}
	
	public int getID() {
		return id;
	}
	
	public double getArea() {
		return area;
	}
	
	public Date getDateBuilt() {
		return this.dateBuilt;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		House houseClone = (House)super.clone();
		houseClone.dateBuilt = (Date)(houseClone.dateBuilt);
		return houseClone;
	}

	@Override
	public int compareTo(House house) {
		if ( area >house.area)
			return 1;
		else if ( area < house.area)
			return -1;
		else 
			return 0;
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		House house1 = new House (1,1750.50);
		House house2 = (House)house1.clone();
		System.out.println(house2.getArea());
	}

}
