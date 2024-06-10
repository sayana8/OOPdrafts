package laba2;

public class Cylinder extends ShapesCubic {
	int radiusOfCylinder;
	
	public int getRadiusOfCylinder() {
		return radiusOfCylinder;
	}
	public void setRadiusOfCylinder(int radiusOfCylinder) {
		this.radiusOfCylinder = radiusOfCylinder;
	}
	
	public Cylinder(int height, int radiusOfCylinder) {
		super(height);
		this.radiusOfCylinder = radiusOfCylinder;
		
	}
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radiusOfCylinder * (radiusOfCylinder + height); 
	}

	@Override
	double findVolume() {
		// TODO Auto-generated method stub
		return Math.PI * radiusOfCylinder * radiusOfCylinder * height ;}

	@Override
	double curvedSurfaceArea() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radiusOfCylinder * height ; 
	}
	

}
