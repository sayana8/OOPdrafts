package laba2;

public class Cube extends ShapesCubic {
	private double length;
	private double width;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width =width;
	}
	
	public Cube(double height, double length, double width) {
		super(height);
		this.length = length;
		this.width = width;
		
	}
	
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		return 6*length *height;
	}

	@Override
	double findVolume() {
		// TODO Auto-generated method stub
		return length * width*height;
	}

	@Override
	double curvedSurfaceArea() {
		// TODO Auto-generated method stub
		return 4 * length * width;
	}
	

}
