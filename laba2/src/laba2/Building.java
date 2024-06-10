package laba2;

public abstract class Building{
	private int numberOfFloors;
	private int floorArea;
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	public int getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}
	public Building(int numberOfFloors, int floorArea) {
	this.numberOfFloors = numberOfFloors;
	this.floorArea = floorArea;}
	
	public String toString() {
		return "Your building has " + numberOfFloors + " floors and their total area is " + floorArea ; 
		
	}
	
	public boolean equals(Object o) {
		if (this  == o) return true;
		if( o == null || getClass( ) != o.getClass() ) return false;
		Building other = (Building) o ;
		return numberOfFloors== other.numberOfFloors && floorArea == other.floorArea;
	}
	
	public int hashcode() {
		int result = numberOfFloors;
		result = 31 * result + floorArea;
		return result;
	}
}