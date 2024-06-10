package laba2;

public class Sphere extends ShapesCubic {
	int radiusOfSphere;
	
	public int getRadiusOfSphere() {
		return radiusOfSphere;
	}
	public void setRadiusOfSphere(int radiusOfSphere) {
		this.radiusOfSphere = radiusOfSphere;
	}
	
	public Sphere(int height, int radiusOfSphere) {
		super(height);
		this.radiusOfSphere = radiusOfSphere;
		
	}
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		return 4 * Math.PI * radiusOfSphere * radiusOfSphere; 
	}

	@Override
	double findVolume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI * radiusOfSphere*radiusOfSphere*radiusOfSphere; 
		}

	@Override
	double curvedSurfaceArea() {
		// TODO Auto-generated method stub
		return findArea(); 
	}
	

}