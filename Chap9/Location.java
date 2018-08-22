
public class Location {
	public int row;
	public int column;
	public double max;
	
	public Location() {
		
	};
	
	public void setRow (int row) {
		this.row = row;
	};
	
	public void setColumn ( int column) {
		this.column = column;
	}
	
	public void setMax( double max ) {
		this.max = max;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public double getMax() {
		return max;
	}
	
	
	public static Location locateLargest(double [][] a ) {
		Location myLocation = new Location();
		int row = 0;
		int column = 0;
		double max = 0;
		for ( int i = 0; i < a.length ; i ++ ) {
			for ( int j = 0; j < a[i].length ; j++) {
				if ( a[i][j] > max) {
					max = a[i][j];
					row = i;
					column=j;
				}
			}
		}
		
		myLocation.setRow(row);
		myLocation.setColumn(column);
		myLocation.setMax(max);
		
		return myLocation;
	}
}
