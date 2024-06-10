package labo2task1;

public abstract class ShapesCubic {
	double height;
	 // for cube h =a = b;
	// for circle h = 2r;
	// for cylinder h =h;
	
	public ShapesCubic(double height) {
		this.height = height;
	}
	
	abstract double findArea() ;
	abstract double findVolume() ;
	abstract double curvedSurfaceArea() ;
	
	
}
