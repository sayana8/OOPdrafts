package laba2;

public class OfficeBuilding extends Building{
	private int numberOfOffices;

	public int getNumberOfOffices() {
		return numberOfOffices;
	}

	public void setNumberOfOffices(int numberOfOffices) {
		this.numberOfOffices = numberOfOffices;
	}
	
	public OfficeBuilding(int numberOfFloors, int floorArea,int numberOfOffices ) {
		super(numberOfFloors, floorArea);
		this.numberOfOffices = numberOfOffices;
	}
	
	public boolean equals(Object o ) {
		if(this ==o) return true;
		if( o == null || getClass() != o.getClass() ) return false;
		if( !super.equals(o)) return false;
		OfficeBuilding other = (OfficeBuilding ) o ;
		return numberOfOffices == other.numberOfOffices;
		
	}
	
	public int hashCode() {
		int result = 31* super.hashcode() + numberOfOffices;
		return result;
	}
	
	public String toString() {
		return super.toString() + " and there are " + numberOfOffices + " offices in this building . ";
		
	}
	
}